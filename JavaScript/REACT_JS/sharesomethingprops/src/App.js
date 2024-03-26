import { Component } from "react";
import "./App.css";
import { CheckDemo } from "./components/CheckDemo";

class App extends Component {
  constructor() {
    super();
    this.state = {
      counter: 100,
    };
  }

  incrementCounter = () => {
    this.setState({ counter: this.state.counter + 1 });
  };

  decreament = () => {
    this.setState({ counter: this.state.counter - 1 });
  };

  render() {
    let n = "Aashish";
    return (
      <>
        <h1>Hi</h1>
        <button onClick={this.decreament}>decreament</button>
        <CheckDemo
          data={n}
          counter={this.state.counter}
          incrementCounter={this.incrementCounter}
        />
      </>
    );
  }

  
}

export default App;
