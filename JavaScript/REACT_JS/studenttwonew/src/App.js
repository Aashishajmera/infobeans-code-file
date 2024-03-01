import { Component } from "react";
import "./App.css";
import { Formdata } from "./components/Formdata";
import { StudentList } from "./components/StudentList";
import { Tabledata } from "./components/Tabledata";

class App extends Component {
  constructor() {
    super();
    this.state = {
      studentList: StudentList,
      defaultBranch: "ALL",
    };
  }

  addNewStudent = (roll,name,branch,mobile) => {
    let newStudent = {
      roll,
      name,
      branch,
      mobile,
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
        <Formdata studentList={this.state.studentList} addNewStudent = {this.addNewStudent} />
        <Tabledata studentList = {this.state.studentList} defaultBranch = {this.state.defaultBranch} deleteStudentRecord = {this.deleteStudentRecord}/>
      </>
    );
  }
}

export default App;
