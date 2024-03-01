import { Component } from "react";

export default class EvenOddCounter extends Component {
  constructor() {
    super();
    this.state = {
      evenCounter: 0,
      oddCounter: 1
    };
  }

  evenCounterIncrement = () => {
    this.setState({ evenCounter: this.state.evenCounter + 2 });
  }

  oddCounterIncrement= () => {
    this.setState({ oddCounter: this.state.oddCounter + 2 });
  }

  render() {
    return <>
        <h1>Even odd counter</h1>
        <button onClick={this.evenCounterIncrement}> evenCounter: {this.state.evenCounter}</button> 
        <button onClick={this.oddCounterIncrement}> OddCounter: {this.state.oddCounter}</button>
    </>;
  }
}
