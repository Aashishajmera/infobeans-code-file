import { useState } from "react";
import { Route, Routes } from "react-router-dom";
import "./App.css";
import { About } from "./components/About";
import { Contact } from "./components/Contact";
import { Header } from "./components/Header";
import { Home } from "./components/Home";


function App() {
  const [counter, setCounter] = useState(0);

  return (
    <>
      <Header />
      <Routes>
        <Route
          path="/home"
          element={<Home counter={counter} setCounter={setCounter} />}
        />
        <Route path="/about" element={<About />} />
        <Route path="/contact" element={<Contact />} />
      </Routes>
    </>
  );
}

export default App;
