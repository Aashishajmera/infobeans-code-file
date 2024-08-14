import React, { useEffect, useState } from 'react';
import {useNavigate} from 'react-router-dom';

export const Home = ({counter, setCounter}) => {

    const [value, setValues] = useState(0);
    const myName = 'Aashish';


    const navigate = useNavigate();
    console.log(navigate);

    useEffect(()=>{
        sessionStorage.setItem("myName",myName)
        sessionStorage.setItem("value",value)
        console.log("I am mount");
        return ()=>{
            console.log("I am unmount...");
        }
    },[])

    const nav = ()=>{
        navigate('/about')
    }
  return (
        <>
            <h1>Counter : {counter} {value}</h1>
            <button onClick={()=>setCounter(counter+1)}>Increment</button>
            <button onClick={()=>setCounter(counter-1)}>Decrement</button>

            <button onClick={nav}>Go to About</button>
        </>
    )
}
