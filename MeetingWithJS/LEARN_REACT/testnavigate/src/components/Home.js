// Home.js
import React from "react";
import { useNavigate } from "react-router-dom";

export default function Home() {
  const navigate = useNavigate();

  const myfun = () => {
    console.log("I am function...");
  };

  const nav = () => {
    navigate("/about", { state: { myfun } }); // Passing myfun directly
  };

  return (
    <>
      <h2>Hii i am home</h2>
      <button className="btn btn-primary" onClick={nav}>
        Change page
      </button>
    </>
  );
}
