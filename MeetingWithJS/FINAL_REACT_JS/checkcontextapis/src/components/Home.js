// import React from 'react'
import React, {useState} from 'react';
import Child1 from './Child1';
import { MyContext } from './MyContext';

export default function Home() {

    const [counter, setCounter] = useState(0);
    console.log('I am home');

  return (
    <>
        <h1>Home page</h1>
        <p>{counter}</p>
        <MyContext.Provider value={{counter, setCounter}}>
        <Child1/>
        </MyContext.Provider>
    </>
  )
}
