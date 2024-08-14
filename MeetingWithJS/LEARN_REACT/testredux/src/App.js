import logo from "./logo.svg";
import "./App.css";
import "react-toastify/dist/ReactToastify.css";
import { useMemo, useState } from "react";

function App() {
  const [Increment, setIncrement] = useState(0);
  const [Decrement, setDecrement] = useState(100);

  const demo = useMemo(() => {
    console.log("jkjkjkjkj");
    return Increment * 10;
  }, [Increment]);


  return (
    <>
      <div className="main">
        <button
          className="btn btn-outline-primary"
          onClick={() => {
            setIncrement(Increment + 1);
          }}>
          Increment
        </button>
        <h1>{Increment}</h1>
        <h2>{Decrement}</h2>
        <button
          className="btn btn-outline-danger"
          onClick={() => {
            setDecrement(Decrement - 1);
          }}>
          Decrement
        </button>
      </div>
    </>
  );
}

export default App;
