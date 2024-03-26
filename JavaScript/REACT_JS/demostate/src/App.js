import { Component } from "react";
import "./App.css";
import Counter from "./components/counter";
import EvenOddCounter from "./components/evenOddCounter";
import InputComponent from "./components/inputComponent";

class App extends Component {
  render() {
    return (
      <>
        <Counter />
        <hr />
        <EvenOddCounter />
        <hr />
        
        <InputComponent />
        <hr />
      </>
    );
  }
}

export default App;
