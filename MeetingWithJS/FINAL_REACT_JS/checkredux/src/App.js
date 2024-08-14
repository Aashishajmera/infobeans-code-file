import logo from "./logo.svg";
import "./App.css";
import { useReducer } from "react";
import { useDispatch, useSelector } from "react-redux";
import { decrement, evenIncrement, increment } from "./components/redux-config/actions/Action";

function App() {

  const counter = useSelector((counter)=>counter.changeCount);
  const evenCounter = useSelector((state)=>state.evenCounterReducer);
  const dispatch = useDispatch();


 return (
  <>
    <h2>home</h2>
    <p>{counter}</p>
    <button onClick={()=>{dispatch(increment())}}>Increment</button>
    <button onClick={()=>{dispatch(decrement())}}>Decrement</button>
    <p>{evenCounter}</p>
    <button onClick={()=>{dispatch(evenIncrement())}}>Click me !!</button>
  </>
 )
}

export default App;
