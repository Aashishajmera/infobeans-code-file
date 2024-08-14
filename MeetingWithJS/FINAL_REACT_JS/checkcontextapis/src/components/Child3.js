import React from 'react'

export default function Child3() {
    const [name, setName] = React.useState('');
    const [password, setPassword] = React.useState('');
   

    return (
    <>
    <label htmlFor='userName'>name:</label>
    <input type='text' id='userName' defaultValue={name} onChange={(e)=>setName(e.target.value)}/>
    <label htmlFor='password'>password: </label>
    <input type='password' id='password' defaultValue={password} onChange={(e)=>setPassword(e.target.value)}></input>
    <button disabled={!name || !password}>submit !!</button>
    </>
  )
}
