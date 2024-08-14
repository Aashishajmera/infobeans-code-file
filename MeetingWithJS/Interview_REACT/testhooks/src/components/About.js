import React, { useEffect, useRef, useState } from "react";
import { useLocation } from "react-router-dom";

export const About = () => {
  const location = useLocation();

//   const { myName, value } = location.state;
  const [name, setName] = useState("");
  const [value,setValue] = useState("") ;

  useEffect(()=>{
     setName(sessionStorage.getItem("myName"))   
  },[])
  console.log(location.state);

  return (
    <>
      <h2>I am About page.....</h2>
      <input type="text" placeholder="name" />
      <input type="email" placeholder="email" />
    </>
  );
};
