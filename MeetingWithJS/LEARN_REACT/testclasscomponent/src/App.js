import logo from "./logo.svg";
import "./App.css";
import { Component } from "react";

class App extends Component {
  constructor() {
    super();
    this.state = {
      counter: 0,
    };
  }

  incrementCounter = () => {
    this.setState({ counter: this.state.counter + 1 });
  };

  decrementCounter = () => {
    this.setState({ counter: this.state.counter - 1 });
  };

  render() {
    return (
      <>
      <button onClick={this.incrementCounter}>Increment</button>
        <h3>{this.state.counter}</h3>
        <button onClick={this.decrementCounter}>Decrement</button>
      </>
    );
  }
}

export default App;
