import { Component } from "react";
import { StudentList } from "./StudentList";
export default class Webpage extends Component {
  constructor() {
    super();
    this.state = {
      studentList: StudentList,
      defaultBranch: "ALL",
    };
  }

  // ADD NEW STUDENT

  addNewStudent = (event) => {
    let newStudent = {
      roll: this.roll.value,
      name: this.name.value,
      branch: this.branch.value,
      mobile: this.mobile.value,
    };
    this.setState({ studentList: [...this.state.studentList, newStudent] });
  };

  deleteStudentRecord = (roll) => {
    let index = this.state.studentList.findIndex(
      (student) => student.roll === roll
    );
    this.state.studentList.splice(index, 1);
    this.setState({ studentList: [...this.state.studentList] });
  };

  render() {
    return (
      <>
        {/* HEADING */}
        <div className="container-fluid bg-danger text-center p-2">
          <h5 className="fw-bold fs-3 text-light">Student App</h5>
        </div>

        {/* FORM DATA */}
        <div className="container">
          <div className="row p-2">
            <div className="col-md-6 form-group">
              <input
                placeholder="Student name: "
                ref={(inputName) => (this.name = inputName)}
                className="form-control"
              />
            </div>
            <div className="col-md-6 form-group">
              <input
                type="text"
                ref={(inputRoll) => (this.roll = inputRoll)}
                placeholder="Student roll number: "
                className="form-control"
              />
            </div>
          </div>
          <div className="row">
            <div className="col-md-6">
              <div className="form-group">
                <select
                  className="form-control"
                  ref={(inputBranch) => (this.branch = inputBranch)}>
                  <option>Select Branch</option>
                  <option value="CS">CS</option>
                  <option value="IT">IT</option>
                  <option value="EC">EC</option>
                  <option value="MECH">MECH</option>
                </select>
              </div>
            </div>
            <div className="col-md-6">
              <div className="form-group">
                <input
                  ref={(inputMobile) => (this.mobile = inputMobile)}
                  type="text"
                  placeholder="Enter contact number"
                  className="form-control"
                />
              </div>
            </div>
          </div>

          <div className="row">
            <div className="col-md-6">
              <button
                className="btn btn-primary mt-2"
                onClick={this.addNewStudent}>
                ADD
              </button>
            </div>
            <div className="col-md-6 d-flex gap-3">
              <button
                className="btn mt-2 pri btn-danger"
                onClick={() => this.setState({ defaultBranch: "CS" })}>
                CS (
                {
                  this.state.studentList.filter(
                    (student) => student.branch === "CS"
                  ).length
                }
                )
              </button>
              <button
                className="btn mt-2 btn-secondary"
                onClick={() => this.setState({ defaultBranch: "IT" })}>
                IT (
                {
                  this.state.studentList.filter(
                    (student) => student.branch === "IT"
                  ).length
                }
                )
              </button>
              <button
                className="btn btn-success mt-2"
                onClick={() => this.setState({ defaultBranch: "EC" })}>
                EC (
                {
                  this.state.studentList.filter(
                    (student) => student.branch === "EC"
                  ).length
                }
                )
              </button>
              <button
                className="btn btn-warning mt-2"
                onClick={() => this.setState({ defaultBranch: "MECH" })}>
                MECH (
                {
                  this.state.studentList.filter(
                    (student) => student.branch === "MECH"
                  ).length
                }
                )
              </button>
              <button
                className="btn btn-dark mt-2"
                onClick={() => this.setState({ defaultBranch: "ALL" })}>
                TOTAL ({this.state.studentList.length})
              </button>
            </div>
          </div>
        </div>

        <div className="container mt-5">
          <table className="table">
            <thead>
              <tr>
                <th>S.no</th>
                <th>Roll Number</th>
                <th>Name</th>
                <th>Branch</th>
                <th>Mobile</th>
                <th>Delete</th>
              </tr>
            </thead>
            <tbody>
              {this.state.studentList
                .filter(
                  (student) =>
                    student.branch === this.state.defaultBranch ||
                    this.state.defaultBranch === "ALL"
                )
                .map((student, index) => (
                  <tr key={index}>
                    <td>{index + 1}</td>
                    <td>{student.roll}</td>
                    <td>{student.name}</td>
                    <td>{student.branch}</td>
                    <td>{student.mobile}</td>
                    <td>
                      <button className="btn btn-danger" onClick={()=>this.deleteStudentRecord(student.roll)}>Delete</button>
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
