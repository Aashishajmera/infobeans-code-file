import axios from "axios";
import { useEffect, useState } from "react";
import Navbar from "./Navbar";

export default () => {
  const [productList, setProductList] = useState([]);
  useEffect(() => {
    // Api Calling Code
    axios
      .get("https://dummyjson.com/products")
      .then((response) => {
        setProductList(response.data.products);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);
  return (
    <>
      <Navbar />
      <div className="container mt-3">
        <h1>Product List</h1>
        <hr />
        <table className="table">
          <thead>
            <tr>
              <th>S.no</th>
              <th>Title</th>
              <th>Brand</th>
              <th>Price</th>
              <th>Image</th>
              <th>Delete</th>
              <th>Edit</th>
            </tr>
          </thead>
          <tbody>
            {productList.map((product, index) => (
              <tr key={index}>
                <td>{index + 1}</td>
                <td>{product.title}</td>
                <td>{product.brand}</td>
                <td>{product.price}</td>
                <td>
                  <img
                    src={product.thumbnail}
                    className="img-fluid"
                    width={100}
                    height={100}></img>
                </td>
                <td>
                  <button className="btn btn-outline-danger">Delete</button>
                </td>
                <td>
                  <button className="btn btn-outline-primary">Edit</button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </>
  );
};
