import React from 'react'
import {useState} from 'react'

function Child({isEdit, fun}) {
    const [counter1,setcounter1] = useState(0)

    console.log("Child Component");


    return(<>
        <h1>Child Component</h1>
        <button onClick={()=>setcounter1(counter1+1)}>Counter1 : {counter1}</button>
        
    </>)
}

export default React.memo(Child);