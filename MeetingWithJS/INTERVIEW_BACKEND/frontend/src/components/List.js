import axios from "axios";
import React, { useEffect, useState } from "react";
import Form from "./Form";

export default function List() {
    const [isEdit, setEdit] = useState(null);
  const [studentList, setStudentList] = useState([]);
  const [updateStudent , setUpdateStudent] = useState('');
  
  useEffect(() => {
    axios
      .get("http://localhost:3000/user/allUser")
      .then((result) => {
        setStudentList(result.data.result);
        // console.log(studentList);
      })
      .catch((err) => {
        console.log(err);
      });
  }, [studentList]);

  const deleteUser = async (email) => {
    try {
      await axios.delete("http://localhost:3000/user/delete", {data:{ email}});
      setStudentList(studentList.filter(student => student.email !== email));
    } catch (error) {
      console.log(error);
    }
  };

  const editFun = (student) =>{
    setEdit(true);
    setUpdateStudent(student);
  }

  return (
    <>
    <Form updateStudent={updateStudent} setStudentList={setStudentList} setUpdateStudent={setUpdateStudent} isEdit={isEdit} setEdit={setEdit}/>
      <div className="container">
        <h1 className="text-success mt-5">USER LIST !!</h1>

        <table className="table">
          <thead>
            <tr>
              <th scope="col">Id</th>
              <th scope="col">Username</th>
              <th scope="col">Email</th>
              <th scope="col">Password</th>
              <th scope="col">edit</th>
              <th scope="col">delete</th>
            </tr>
          </thead>
          <tbody>
            {studentList.map((student, index) => (
              <tr key={index}>
                <td>{index + 1}</td>
                <td>{student.userName}</td>
                <td>{student.email}</td>
                <td>{student.password}</td>
                <th scope="col">
                  <button className="btn btn-primary" onClick={()=>{editFun(student)}}>edit</button>
                </th>
                <th scope="col">
                  <button
                    className="btn btn-danger"
                    onClick={() => deleteUser(student.email)
                    }>
                    delete
                  </button>
                </th>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </>
  );
}
