import React from "react";
import Update from "../UpdateComponent/Update";

export default function TodoItems({ todo, onDelete, onUpdate }) {
  return (
    <>
      <tr>
        <th>{todo.no}</th>
        <td>{todo.name}</td>
        <td>{todo.surname}</td>
        <td>
          <button className="btn btn-sm btn-outline-danger" onClick={()=>{onDelete(todo)}}>Delete</button>
        </td>
        <td>
          <button className="btn btn-sm btn-primary" onClick={()=>{onUpdate(todo)}}>Update</button>
        </td>
      </tr>
    </>
  );
}
