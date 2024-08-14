import "./App.css";
import { useEffect, useState } from "react";

function App() {

  const [first, setfirst] = useState(0)

  useEffect(()=> {
    alert("Hii")
    console.log("Hiii");
  }, []);

  useEffect(()=>{
    console.log("Hello", {first});
  }, [first])

  const con = {
    margin: "10px"
  }

  return (
    <>
      <h2>Hii {first}</h2>
      <button onClick={()=>{setfirst(first+1)}} style={con}>click</button>
      <button>Value is: {first}</button>
    </>
  );
}

export default App;
