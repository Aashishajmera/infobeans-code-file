import React from "react";
import { MyContext } from "../App";
import { Outlet, useNavigate } from "react-router-dom";

export default function About() {
  const navigate = useNavigate();
  const context = React.useContext(MyContext);
  console.log(context);
  return (
    <>
      <h2>I am About {context.name}</h2>
      <button
        onClick={() => {
          navigate("nested");
        }}>
        click nested page
      </button>
      <button
        onClick={() => {
          navigate("doublenested");
        }}>
        Double nested
      </button>
      <hr />
      <hr />
      <div>
        <h2>Hiii guys...</h2>
        <Outlet />
      </div>
    </>
  );
}
