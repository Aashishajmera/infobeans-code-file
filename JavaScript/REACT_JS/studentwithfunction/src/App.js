import { useState } from "react";
import "./App.css";
import Form from "./components/Form";
import { StudentList } from "./components/StudentList";
import Tabledata from "./components/TableData";

function App() {
  const [studentList, setStudentList] = useState(StudentList);
  const [defaultBranch, setBranch] = useState("ALL");

  const addStudent = (
    studentValue,
    studentRollNumberValue,
    studentBranchValue,
    studentMobileNumValue
  ) => {
    alert("hi");
    let roll = studentRollNumberValue.current.value;
    console.log(roll);
    let name = studentValue.current.value;
    console.log(name);
    let branch = studentBranchValue.current.value;
    console.log(branch);
    let mobile = studentMobileNumValue.current.value;
    let newStudent = { roll, name, branch, mobile };
    let arr = [...studentList, newStudent];
    console.log(arr);
    setStudentList(arr);
  };

  const deleteRecord = (roll) => {
    let index = studentList.findIndex((student) => {
      return student.roll === roll;
    });
    studentList.splice(index, 1);
    let arr = [...studentList];
    setStudentList(arr);
  };

  const updateBranch = (branch) => {
    setBranch(branch);
  };

  return (
    <>
      <Form addStudent={addStudent} studentList={studentList}  updateBranch = {updateBranch}/>
      <Tabledata studentList={studentList} deleteRecord={deleteRecord} defaultBranch = {defaultBranch} />
    </>
  );
}

export default App;
