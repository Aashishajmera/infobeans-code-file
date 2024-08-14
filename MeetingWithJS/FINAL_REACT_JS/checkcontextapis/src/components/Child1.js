import React from 'react'
import Child2 from './Child2.js'

function Child1() {
    console.log('I am child_1');
  return (
    <>
        <div>Child1</div>
        <Child2/>
    </>
  )
}

export default React.memo(Child1);