import "./App.css";
import { Routes, Route } from "react-router-dom";
import Home from "./componentes/Home";
import About from "./componentes/About";
import AboutBottom from "./componentes/AboutBottom";

function App() {
  const obj = {};

  return (
    <>
      <Routes>
        <Route path="home" element={<Home />}>
          <Route path="first" element={<About />} />
          <Route path="second" element={<AboutBottom />} />
        </Route>
      </Routes>
    </>
  );
}

export default App;
