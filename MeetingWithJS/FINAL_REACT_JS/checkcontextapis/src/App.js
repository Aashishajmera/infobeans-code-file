import logo from "./logo.svg";
import "./App.css";
import { useState } from "react";
import { Routes, Route } from "react-router-dom";
import Home from "./components/Home";
import Child1 from "./components/Child1";
import Child2 from "./components/Child2";
import Child3 from "./components/Child3";

function App() {
  return (
    <>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/child1" element={<Child1/>} />
        <Route path="/child2" element={<Child2/>} />
        <Route path="/child3" element={<Child3/>} />
      </Routes>
    </>
  );
}

export default App;
