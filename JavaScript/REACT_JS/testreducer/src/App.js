import "./App.css";
import { Counter } from "./components/Counter";
import { Main } from "./components/Main";

function App() {
  return (
    <>
      <Main />
      <div className="container">
        {/* <Product/> */}
        <Counter />
      </div>
    </>
  );
}

export default App;
