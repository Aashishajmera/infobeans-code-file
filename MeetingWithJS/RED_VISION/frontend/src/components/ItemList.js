import axios from "axios";
import React, { useEffect, useState } from "react";
import ItemForm from "./ItemForm";

export default function ItemList() {
  const [itemList, setItems] = useState([]);
  const [editItem, setEditItem] = useState(null);

  useEffect(() => {
    axios.get("http://localhost:3000/api/items/getitem")
      .then(response => {
        setItems(response.data.result);
      })
      .catch(err => {
        console.log(err);
      });
  }, []);

  const deleteItem = async (_id) => {
    try {
      await axios.delete("http://localhost:3000/api/items/deleteitem", { data: { _id } });
      setItems(itemList.filter(item => item._id !== _id));
    } catch (error) {
      console.error("Error deleting item:", error);
    }
  };

  const handleEdit = (item) => {
    setEditItem(item);
  };

  return (
    <>
      <ItemForm editItem={editItem} setItems={setItems} />
      <div className="container">
        <table className="table">
          <thead>
            <tr>
              <th scope="col">ID</th>
              <th scope="col">Title</th>
              <th scope="col">Description</th>
              <th scope="col">Edit</th>
              <th scope="col">Delete</th>
            </tr>
          </thead>
          <tbody>
            {itemList.map((item, index) => (
              <tr key={index}>
                <th scope="row">{index + 1}</th>
                <td>{item.title}</td>
                <td>{item.description}</td>
                <td>
                  <button className="btn btn-primary" onClick={() => handleEdit(item)}>edit</button>
                </td>
                <td>
                  <button className="btn btn-danger" onClick={() => deleteItem(item._id)}>delete</button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </>
  );
}
