import axios from "axios";
import { useState } from "react";
import { Link } from "react-router-dom";
import { ToastContainer, toast } from "react-toastify";

export default () => {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");

  const signIn = () => {
    axios
      .post("http://localhost:3000/user/signIn", {
        username,
        password,
      })
      .then((response) => {
        if (response.status === 201) {
          toast.success("Sign In successfully");
          sessionStorage.setItem("username: ", username);
          sessionStorage.setItem("isLoggedIn", "true");
          sessionStorage.setItem("userId", response.data.user.id);
        }
      })
      .catch((err) => {
        console.log(err);
        toast.error(err);
      });
  };

  return;
  <>
    <ToastContainer />
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
            <label>password: </label>
            <input
              onChange={(event) => setPassword(event.target.value)}
              type="password"
              placeholder="User password"
              className="form-control"></input>
          </div>
          <div className="form-group">
            <button onClick={signIn} className="btn btn-primary">
              signIn
            </button>
            <Link className="ml-3" to="/">
              Create new account
            </Link>
          </div>
        </div>
      </div>
    </div>
  </>;
};
