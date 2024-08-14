import React from "react";
import { useContext } from "react";
import { MyContext } from "./MyContext";
import { Link } from "react-router-dom";

function Child2() {
  const context = useContext(MyContext);
  const { counter, setCounter } = context;
  console.log("I am child_2");

  const handleSubmit = (e) => {
    console.log(e.target);
  }

  return (
    <>
      <div>Child2</div>
      <input onChange={handleSubmit} defaultValue={'sldkfj'}/>
      <button onClick={() => setCounter(counter + 1)}>click me !!</button> <br/>
      <Link to={'/child3'} style={{color: 'red', textDecoration: 'none'}}> Go To Child_3 </Link>
    </>
  );
}

export default React.memo(Child2);