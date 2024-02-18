import { Component } from "react";
import Header from "./components/header/header";
import Main from "./components/mainComponent/main";

class App extends Component {
  render() {
    return (
      <>
        <Header />
        <Main />
      </>
    );
  }
}

export default App;
