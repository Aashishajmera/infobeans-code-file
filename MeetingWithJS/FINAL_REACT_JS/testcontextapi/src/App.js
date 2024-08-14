import logo from "./logo.svg";
import "./App.css";
import {useState, useCallback} from 'react'
import Child from "./Child";

function App() {
  const [counter,setcounter] = useState(0)
  const [edit, setEdit] = useState(null);

  const fun = useCallback( () => {
    
  }, [])
  
  return (
    <>
     <h1>Parent Component</h1>
     <button onClick={()=>setcounter(counter+1)}>Counter : {counter}</button>
     <Child edit={edit} fun={fun}/>
    </>
  );
}

export default App;
