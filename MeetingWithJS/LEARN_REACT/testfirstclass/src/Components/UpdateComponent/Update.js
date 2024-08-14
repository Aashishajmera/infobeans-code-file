import React from "react";

export default function Update({onUpdate, update, setStatus}) {

    const displayNonefun = ()=>{
        setStatus(false);
    }

  return (
    <>
        <div className="container border mt-3 mb-3">
            <h2 className="text-center">Update form details</h2>
        <form className="p-3 m-2">
          <div class="form-group">
            <label for="userName">Name: </label>
            <input
              type="text"
              class="form-control"
              id="userName"
              placeholder="Enter your name"
              value={update[0].name}
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
              value={update[0].surname}
            />
          </div>
          <br></br>
          <button type="submit" class="btn btn-primary" onClick={displayNonefun}>
            Update
          </button>
        </form>
      </div>
    </>
  )}
