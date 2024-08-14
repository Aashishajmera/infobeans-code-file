import './App.css';
import {useReducer} from 'react';

function App() {

  const reducer = (state, action) => {
    switch(action.type){
      case 'Increment': return state + action.payload;
      case 'Decrement': return state - action.payload;
      default: return state;
    }
  }

const [state , dispatch] = useReducer(reducer, 0);
  
  return (
    <>
      <h2>{state}</h2>
      <button onClick={()=>{dispatch({type: 'Increment', payload: 2})}}>Increment !!</button>
      <button onClick={()=>{dispatch({type: 'Decrement', payload: 2})}}>Decrement !!</button>
    </>
  );
}

export default App;
