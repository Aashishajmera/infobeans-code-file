import React from "react";
import "./Home.css";
import { Outlet, useNavigate } from "react-router-dom";

export default function Home() {

    const navigate = useNavigate();

  return (
    <>
      <div className="container" id="main-container">
        <div id="left-container">
          <button onClick={()=>{navigate('first')}}>First button</button><hr></hr>
          <button onClick={()=>{navigate('second')}}>Second button</button><hr></hr>
        </div>
        <div>
            <Outlet/>
        </div>
      </div>
    </>
  );
}
