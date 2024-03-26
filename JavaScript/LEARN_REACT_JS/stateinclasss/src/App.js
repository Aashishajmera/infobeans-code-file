import { Component } from 'react';
import './App.css';

class App extends Component{
  constructor(){
    super();

    this.state = {
      counter: 1
    }
  }

  changeCounter = () =>{
    this.setState({counter: this.state.counter+1})
  }

  render(){
    return <>
      <h2>Hii, I am value {this.state.counter}</h2>
      <button onClick={this.changeCounter}>Change</button>
    </>
  }
  
}

export default App;
