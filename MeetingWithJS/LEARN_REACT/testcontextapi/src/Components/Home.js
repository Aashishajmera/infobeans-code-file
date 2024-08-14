// Home.js
import React, { useContext } from "react";
import { MyContext } from "../App"; // Correct import

export default function Home() {
  const contex = useContext(MyContext);
  console.log(contex);

  return (
    <>
      <h2>Hii I am home {contex.name}</h2>
    </>
  );
}
