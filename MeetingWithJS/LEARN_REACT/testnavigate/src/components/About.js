// About.js
import React from "react";
import { useLocation, useNavigate } from "react-router-dom";

export default function About() {
  const navigate = useNavigate();
  const location = useLocation();
  const { state } = location;

  const handleClick = () => {
    // Access the function from the state and call it
    if (state && state.myfun) {
      state.myfun();
    }
  };

  return (
    <>
      <div>I am about </div>
      <button
        className="btn btn-secondary"
        onClick={() => {
          navigate(-1);
        }}>
        Back
      </button>
      <button className="btn btn-danger ms-1" onClick={handleClick}>
        Call Function
      </button>
    </>
  );
}
