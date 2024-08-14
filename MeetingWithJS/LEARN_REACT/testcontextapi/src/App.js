// App.js
import "./App.css";
import { Routes, Route } from "react-router-dom";
import Home from "./Components/Home";
import React from "react";
import About from "./Components/About";
import Nested from "./Components/Nested";
import DoubleNested from "./Components/DoubleNested";

export const MyContext = React.createContext();

function App() {
  const obj = {
    name: "I am aashish",
  };

  return (
    <MyContext.Provider value={obj}>
      <Routes>
        {/* Wrap your routes with a Route component */}
        <Route path="home" element={<Home />} />
        <Route path="about" element={<About/>}>
          <Route index path="nested" element={<Nested/>}/>
          <Route path="doublenested" element={<DoubleNested/>}/>
        </Route>
      </Routes>
    </MyContext.Provider>
  );
}

export default App;