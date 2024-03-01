import { Component } from "react";
export class CheckDemo extends Component {
  render() {
    let {data,counter,incrementCounter} = this.props;
    return (
      <>
        <h2>I am checkdemo ,{data}</h2>
        <h1> {counter}</h1>
        <button onClick={incrementCounter}>Increment</button>
      </>
    );
  }
}
