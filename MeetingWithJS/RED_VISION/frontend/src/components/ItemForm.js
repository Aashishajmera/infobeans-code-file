import axios from "axios";
import React, { useState, useEffect } from "react";

export default function ItemForm({ editItem, setItems }) {
  const [title, setTitle] = useState("");
  const [description, setDescription] = useState("");
  const [isEditing, setIsEditing] = useState(false); 

  useEffect(() => {
    if (editItem) {
      setTitle(editItem.title);
      setDescription(editItem.description);
      setIsEditing(true);
    } else {
      setTitle("");
      setDescription("");
      setIsEditing(false);
    }
  }, [editItem]);

  const handleSubmit = async (event) => {
    event.preventDefault();
    const newItem = { title, description };
    try {
      if (isEditing) {
        // If editing, update the item
        const updatedItem = { _id: editItem._id, ...newItem };
        await axios.put("http://localhost:3000/api/items/updateItem", updatedItem);
        setItems(prevItems => prevItems.map(item => (item._id === editItem._id ? updatedItem : item)));
      } else {
        // If not editing, add a new item
        const response = await axios.post("http://localhost:3000/api/items/additem", newItem);
        setItems(prevItems => [...prevItems, response.data.result]);
      }
      // Reset form fields
      setTitle("");
      setDescription("");
      setIsEditing(false); // Exit editing mode after submission
    } catch (error) {
      console.error("Error:", error);
    }
  };

  return (
    <div className="container">
      <form onSubmit={handleSubmit}>
        <div className="form-group mt-2">
          <label htmlFor="title">Title</label>
          <input
            type="text"
            className="form-control"
            placeholder="Enter title"
            value={title}
            onChange={(e) => setTitle(e.target.value)}
          />
        </div>
        <div className="form-group mt-2">
          <label htmlFor="description">Description</label>
          <input
            type="text"
            className="form-control"
            placeholder="Enter description"
            value={description}
            onChange={(e) => setDescription(e.target.value)}
          />
        </div>
        <button type="submit" className="btn btn-primary mt-2 mb-5">
          {isEditing ? "Update Item" : "Add Item"}
        </button>
      </form>
    </div>
  );
}
