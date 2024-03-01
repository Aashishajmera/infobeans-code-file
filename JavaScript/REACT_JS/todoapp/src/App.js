import { Component } from "react";
import "./App.css";
import Data from "./component/Data";

class App extends Component {
  constructor() {
    super();
    this.state = {
      taskList: Data,
      priorityList: [
        { priorityId: 1, priorityValue: "Low" },
        { priorityId: 2, priorityValue: "Medium" },
        { priorityId: 3, priorityValue: "High" },
      ],
      defaultStatus: "active",
    };
  }

  // ADD NEW TASK
  addTask = () => {
    console.log("HII");
    let title = this.title.value;
    console.log(title);
    let pid = this.priority.value;
    console.log(typeof pid);
    console.log(pid);
    let id = Date.now();
    console.log(id);
    let status = "active";
    let date = new Date();
    date =
      date.getDate() + "/" + (date.getMonth() + 1) + "/" + date.getFullYear();

    let newTask = { id, pid, title, status, date };
    console.log(newTask);
    this.setState({ taskList: [...this.state.taskList, newTask] });
  };

  // DEACTIVE TASK
  taskDeactive = (task) => {
    let updateTask = this.state.taskList;
    let index = this.state.taskList.findIndex((arr) => {
      return arr.title === task.title;
    });
    let value = (task.status = "active" ? "deactive" : "active");

    updateTask[index].status = value;
    this.setState({ taskList: updateTask });
  };

  render() {
    let p = this.state.priorityList;
    console.log(p);
    return (
      <>
        <div>
          <h2 className="bg-danger text-center p-2 fw-bold text-white">
            ToDoApp
          </h2>
        </div>

        <div className="container mt-3">
          <div className="row">
            <div className="col-md-6">
              <input
                ref={(titleInput) => {
                  this.title = titleInput;
                }}
                placeholder="Enter task "
                type="text"
                className="form-control"></input>
            </div>

            <div className="col-md-6">
              <select
                className="form-control"
                ref={(priorityInput) => {
                  this.priority = priorityInput;
                }}>
                {this.state.priorityList.map((priorityObj, index) => (
                  <option key={index} value={priorityObj.priorityId}>
                    {priorityObj.priorityValue}
                  </option>
                ))}
              </select>
            </div>

            <div className="col-12 mt-3">
              <button className="btn btn-success" onClick={this.addTask}>
                ADD
              </button>
            </div>
          </div>

          <div className="row mt-3">
            <div className="col-12">
              <button
                disabled={this.state.defaultStatus == "active" ? true : false}
                onClick={() => this.setState({ defaultStatus: "active" })}
                className="btn btn-info me-2">
                Active (
                {
                  this.state.taskList.filter((task) => task.status == "active")
                    .length
                }
                )
              </button>

              <button
                disabled={this.state.defaultStatus == "deactive" ? true : false}
                onClick={() => this.setState({ defaultStatus: "deactive" })}
                className="btn btn-warning ml-2">
                Deactive (
                {
                  this.state.taskList.filter(
                    (task) => task.status == "deactive"
                  ).length
                }
                )
              </button>
            </div>
          </div>
        </div>

        <div className="container mt-3">
          <table className="table">
            <thead>
              <tr>
                <th>S.no</th>
                <th>Title</th>
                <th>Created Date</th>
                <th>Priority</th>
                <th>Change Status</th>
              </tr>
            </thead>

            <tbody>
              {this.state.taskList
                .filter((task) => task.status === this.state.defaultStatus)
                .sort((i, j) => {
                  return i.pid > j.pid ? 1 : -1;
                })
                .map((task, index) => (
                  <tr
                    key={index}
                    className={
                      task.pid == 1
                        ? "bg-danger"
                        : task.pid == 2
                        ? "bg-warning"
                        : "bg-success"
                    }>
                    <td>{index + 1}</td>
                    <td>{task.title}</td>
                    <td>{task.date}</td>
                    <td>
                      {
                        p.find((priorityObj) => {
                          return priorityObj.priorityId == task.pid;
                        }).priorityValue
                      }
                    </td>
                    <td>
                      <button
                        onClick={() => this.taskDeactive({ ...task })}
                        className={
                          task.status === "active"
                            ? "btn btn-danger"
                            : "btn btn-info"
                        }>
                        {task.status === "active" ? "Deactive" : "Active"}
                      </button>
                    </td>
                  </tr>
                ))}
            </tbody>
          </table>
        </div>
      </>
    );
  }
}

export default App;
