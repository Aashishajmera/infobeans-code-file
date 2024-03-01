import "./App.css";
import { Component } from "react";

class App extends Component {
  render() {
    return (
      <>
        <div className="container-fluid bg-danger mb-4">
          <h1 className="text-center text-white fw-bold p-2">ToDo App </h1>
        </div>

{/* INPUT FORM */}
        <div className="container">
          <div className="row">
            <div className="col-md-6 form-group">
              <input
                className="form-control"
                type="text"
                placeholder="Enter task"
              />
            </div>
            <div className="col-md-6">
              <select className="form-control">
                <option>select priority</option>
                <option value="LOW">low</option>
                <option value="MEDIUM">Medium</option>
                <option value="HIGH">High</option>
              </select>
            </div>
          </div>
        </div>

{/* BUTTON */}
        <div className="container mt-3">
          <button className="btn btn-outline-success mb-2">Add task</button> <br/>
          <button className="btn btn-primary">Active</button> 
          <button className="btn btn-danger ms-3">Deactive</button> 


        </div>

{/* TABLE */}
      <div className="container mt-5">
        <table className="table text-bg-dark">
          <thead>
            <tr>
              <th>S.no</th>
              <th>Task Name</th>
              <th>Date</th>
              <th>Priority</th>
              <th>Status</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>1</td>
              <td>task-1</td>
              <td></td>
              <td>1</td>
              <td>1</td>
            </tr>
          </tbody>
        </table>
      </div>


      </>
    );
  }
}

export default App;
