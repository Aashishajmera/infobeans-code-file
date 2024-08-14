import axios from "axios";
import React, { useEffect, useState } from "react";

export default function Form({
  isEdit,
  setEdit,
  updateStudent,
  setUpdateStudent,
}) {
  const [userName, setName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  useEffect(() => {
    if (isEdit && updateStudent) {
      setName(updateStudent.userName || "");
      setEmail(updateStudent.email || "");
      setPassword(updateStudent.password || "");
    } else {
      setName("");
      setEmail("");
      setPassword("");
    }
  }, [isEdit, updateStudent]);

  const addNewUser = () => {
    console.log(userName + " " + email + " " + password);
    if (isEdit) {
      if (!email) setEmail(updateStudent?.email);
      if (!password) setPassword(updateStudent?.password);
      if (!userName) setName(updateStudent?.userName);
      console.log('hiii');
      axios.put('http://localhost:3000/user/update', { userName, email, password }).then((result) => {
        alert("update successfully...");
        setEdit(false);
        setName('');
        setEmail('');
        setPassword('');
        setUpdateStudent({});
        console.log(result);
      }).catch(err => {
        console.log(err);
      });
    } else {
      console.log(userName + " " + email + " " + password);
      axios.post("http://localhost:3000/user/signup", {
        userName,
        email,
        password,
      }).then((result) => {
        alert("User added successfully...");
        setName('');
        setEmail('');
        setPassword('');
        console.log(result);
      }).catch((err) => {
        console.log(err);
      });
    }
  };

  return (
    <>
      <div className="container">
        <h1 className="text-center mb-2">User Form !!</h1>
        <div className="row">
          <div className="col-md-6">
            <input
              type="text"
              className="form-control"
              placeholder="First name"
              value={userName}
              onChange={(e) =>
                setName(e.target.value)
              }
            />
          </div>
          <div className="col-md-6">
            <input
              type="email"
              className="form-control"
              placeholder="Enter email"
              value={email}
              onChange={(e) =>
                setEmail(e.target.value)
              }
            />
          </div>
        </div>
        <div className="row mt-2">
          <div className="col-md-12">
            <input
              type="password"
              className="form-control"
              placeholder="Enter password"
              value={password}
              onChange={(e) =>
                setPassword(e.target.value)
              }
            />
          </div>
        </div>
        <div className="row mt-2">
          <div className="col-md-12">
            <button className="btn btn-primary" onClick={addNewUser}>
              {isEdit ? "UPDATE" : "ADD"}
            </button>
          </div>
        </div>
      </div>
    </>
  );
}
