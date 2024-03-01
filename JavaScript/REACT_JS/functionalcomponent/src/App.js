import { useRef, useState } from "react";
import "./App.css";
import Header from "./components/Header";

function App() {
  const [counter, setCounter] = useState(100);
  const [message, setMessage] = useState("");
  const [evenNumber, setEvenNumber] = useState(0);
  const [dataList, setDatalist] = useState([{name: 'Aashish', age: 18}, {name: 'Raj', age: 19}])

  let messageValue = useRef(null);

  const changeValue = () => {
    setCounter(counter + 1);
  };

  const showMessage = () => {
    setMessage(messageValue.current.value);
  };

  return (
    <>
      <Header />
      <button onClick={changeValue}>Change Value</button>
      <h1 style={{ margin: 0 }}>{counter}</h1>
      <hr></hr>
      <input ref={messageValue} type="text" placeholder="Type something" />
      <button onClick={showMessage}>show data</button>
      <p>{message}</p>

      <hr></hr>
      <button
        onClick={() => {
          setEvenNumber(evenNumber + 2);
        }}>
        EvenIncrement:
      </button>

      <p>{evenNumber}</p>
      <hr></hr>

        {dataList.map((data, index)=>
          <p key={index}>{data.name} : {data.age}</p>
        )}
    </>
  );
}

export default App;
