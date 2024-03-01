import { Component } from "react";

export class FormComponent extends Component {
  render() {
    return (
      <>
        <form>
          <label>Name: </label>
          <input type="text" placeholder="username: "></input> <br />
          <br />
          <label>Email: </label>
          <input type="email" placeholder="email: "></input> <br /> <br />
          <label>Password: </label>
          <input type="password" placeholder="password: "></input> <br /> <br />
          <button>Submit</button>
        </form>
      </>
    );
  }
}
