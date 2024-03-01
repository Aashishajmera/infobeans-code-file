import { useRef } from "react";

export default function Form(props) {
  const { addStudent, studentList, updateBranch } = props;
  const studentValue = useRef(null);
  const studentRollNumberValue = useRef(null);
  const studentBranchValue = useRef(null);
  const studentMobileNumValue = useRef(null);

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
              placeholder="Student name:"
              ref={studentValue}
              className="form-control"
            />
          </div>
          <div className="col-md-6 form-group">
            <input
              type="text"
              ref={studentRollNumberValue}
              placeholder="Student roll number: "
              className="form-control"
            />
          </div>
        </div>
        <div className="row">
          <div className="col-md-6 form-group">
            <select ref={studentBranchValue} className="form-control">
              <option>Select Branch</option>
              <option value="CS">CS </option>
              <option value="IT">IT</option>
              <option value="EC">EC</option>
              <option value="MECH">MECH</option>
            </select>
          </div>
          <div className="col-md-6">
            <div className="form-group">
              <input
                type="text"
                ref={studentMobileNumValue}
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
              onClick={() =>
                addStudent(
                  studentValue,
                  studentRollNumberValue,
                  studentBranchValue,
                  studentMobileNumValue
                )
              }>
              ADD
            </button>
          </div>
          <div className="col-md-6 d-flex gap-3">
            <button className="btn mt-2 pri btn-danger" onClick={() => updateBranch('CS')}>
              CS(
              {studentList.filter((student) => student.branch === "CS").length})
            </button>
            <button className="btn mt-2 btn-secondary">
              IT (
              {studentList.filter((student) => student.branch === "IT").length})
            </button>
            <button className="btn btn-success mt-2">
              EC (
              {studentList.filter((student) => student.branch === "EC").length}){" "}
            </button>
            <button className="btn btn-warning mt-2">
              MECH (
              {
                studentList.filter((student) => student.branch === "MECH")
                  .length
              }
              )
            </button>
            <button className="btn btn-dark mt-2">
              TOTAL ({studentList.length})
            </button>
          </div>
        </div>
      </div>
    </>
  );
}
