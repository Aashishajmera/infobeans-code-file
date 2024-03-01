import { Component } from "react";

export default class InputComponent extends Component {
  constructor() {
    super();

    this.state = {
      message: "Default message",
    };
  }

  showMessage = () => {
    this.setState({ message: document.getElementById("data").value });
  };

  render() {
    const color = {
      color: "red",
    };

    return (
      <>
        <input id="data" type="text" placeholder="Type something"></input>
        <button onClick={this.showMessage}>Check Text</button>
        <h1 style={color}>{this.state.message}</h1>
      </>
    );
  }
}
