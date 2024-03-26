import { useState } from "react";
import "./App.css";
function App() {
  const [counter, setCounter] = useState(100);

  const changeValue = () => {
    setCounter(counter + 1);
  };

  return (
    <>
      <h3>{counter}</h3>
      <button onClick={changeValue}>Click</button>
    </>
  );
}

export default App;
