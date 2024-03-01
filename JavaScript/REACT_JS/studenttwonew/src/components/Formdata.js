import { Component } from "react";

export class Formdata extends Component {
  render() {
    const { studentList, addNewStudent } = this.props;
    console.log(studentList);
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
              <button className="btn btn-primary mt-2" onClick={()=>addNewStudent(this.roll.value,this.name.value,this.branch.value,this.mobile.value)}>
                ADD
              </button>
            </div>
            <div className="col-md-6 d-flex gap-3">
              <button
                className="btn mt-2 pri btn-danger"
                onClick={() => this.setState({ defaultBranch: "CS" })}>
                CS (
                {
                  studentList.filter((student) => student.branch === "CS")
                    .length
                }
                )
              </button>
              <button
                className="btn mt-2 btn-secondary"
                onClick={() => this.setState({ defaultBranch: "IT" })}>
                IT (
                {
                  studentList.filter((student) => student.branch === "IT")
                    .length
                }
                )
              </button>
              <button
                className="btn btn-success mt-2"
                onClick={() => this.setState({ defaultBranch: "EC" })}>
                EC (
                {
                  studentList.filter((student) => student.branch === "EC")
                    .length
                }
                )
              </button>
              <button
                className="btn btn-warning mt-2"
                onClick={() => this.setState({ defaultBranch: "MECH" })}>
                MECH (
                {
                  studentList.filter((student) => student.branch === "MECH")
                    .length
                }
                )
              </button>
              <button
                className="btn btn-dark mt-2"
                onClick={() => this.setState({ defaultBranch: "ALL" })}>
                TOTAL ({studentList.length})
              </button>
            </div>
          </div>
        </div>
      </>
    );
  }
}
