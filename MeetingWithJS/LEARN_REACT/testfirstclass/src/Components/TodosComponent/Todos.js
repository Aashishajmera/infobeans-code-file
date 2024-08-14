import React from "react";
import TodoItems from "../TodoItemsComponent/TodoItems";
import Update from "../UpdateComponent/Update";

export default function Todos({ todos, onDelete, onUpdate }) {
  return (
    <>
      <div className="container">
        <h1 className="text-center">Todos List...</h1>

        <table className="table">
          <thead>
            <tr>
              <th scope="col">S.no</th>
              <th scope="col">Name</th>
              <th scope="col">Surname</th>
              <th scope="col">Delete</th>
              <th scope="col">Update</th>
            </tr>
          </thead>
          <tbody>
          {todos.length === 0 ? (
            <h2>Empty Todo List...</h2>
          ) : (
            todos.map((todo) => {
              return (
                <>
                    <TodoItems todo={todo} onDelete={onDelete} onUpdate={onUpdate}/>
                </>
              );
            })
          )}
          </tbody>
        </table>
      </div>
    </>
  );
}
