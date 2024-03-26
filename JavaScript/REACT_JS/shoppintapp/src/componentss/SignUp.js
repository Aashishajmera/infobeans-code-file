import axios from "axios";
import { useState } from "react";
import { Link } from "react-router-dom";
import { ToastContainer, toast } from "react-toastify";

export default  () => {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [contact, setContect] = useState("");
 
   
  const signUp = () => {
    axios.post("http://localhost:3000/user/signUp", {
        username :username,
        password: password,
        contact:contact,
      })
      .then((response) => {
        console.log("response come");
        console.log(response.data);
        if (response.status === 201) {
          toast.success("Sign up successfully");
        }
      })
      .catch((err) => {
        console.log(err);
        toast.error(err);
      });
  };

  // ================================
  return (
    <>
    <ToastContainer/>
      <div className="container main">
        <div className="form-group border p-3 d-flex align-items-center justify-content-center">
          <div className="form-container">
            <div className="form-group">
              <label>Name: </label>
              <input
                onChange={(event) => setUsername(event.target.value)}
                type="text"
                placeholder="User name: "
                className="form-control"></input>
            </div>
            <div className="form-group">
              <label>contact: </label>
              <input
                onChange={(event) => setContect(event.target.value)}
                type="tel"
                placeholder="User contact"
                className="form-control"></input>
            </div>
            <div className="form-group">
              <label>password: </label>
              <input
                onChange={(event) => setPassword(event.target.value)}
                type="password"
                placeholder="User password"
                className="form-control"></input>
            </div>
            <div className="form-group">
              <button onClick={signUp} className="btn btn-primary">
                signUp
              </button>
              <Link className="ml-3" to="/SignIn">
                Alredy have account ?
              </Link>
            </div>
          </div>
        </div>
      </div>
    </>
  );

};
