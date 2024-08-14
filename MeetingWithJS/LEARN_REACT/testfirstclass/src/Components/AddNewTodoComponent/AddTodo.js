import React, { useState } from "react";

export default function AddTodo({ addTodoItems, todos }) {
  const [userName, setUserName] = useState("");
  const [userSurname, setUserSurname] = useState("");

  const handleSubmit = (e) => {
    if (!userName || !userSurname) {
      alert("Please fill the field...");
    } else {
      e.preventDefault();
      let no;
      if (todos.length === 0) {
        no = 1;
      } else {
        no = todos[todos.length - 1].no + 1;
      }
      const newTodo = {
        no: no,
        name: userName,
        surname: userSurname,
      };

      addTodoItems(newTodo);
      setUserName("");
      setUserSurname("");
    }
  };

  return (
    <>
      <div className="container border mt-3 mb-3">
        <form className="p-3 m-2">
          <div class="form-group">
            <label for="userName">Name: </label>
            <input
              type="text"
              class="form-control"
              id="userName"
              placeholder="Enter your name"
              value={userName}
              onChange={(e) => {
                setUserName(e.target.value);
              }}
            />
          </div>
          <br></br>
          <div class="form-group">
            <label for="userSurname">Surname: </label>
            <input
              type="text"
              class="form-control"
              id="userSurname"
              placeholder="Enter your surname"
              value={userSurname}
              onChange={(e) => {
                setUserSurname(e.target.value);
              }}
            />
          </div>
          <br></br>
          <div class="form-check">
            <input
              type="checkbox"
              class="form-check-input"
              id="exampleCheck1"
            />
            <label class="form-check-label" for="exampleCheck1">
              Check me out
            </label>
          </div>
          <button type="submit" class="btn btn-primary" onClick={handleSubmit}>
            Submit
          </button>
        </form>
      </div>
    </>
  );
}
