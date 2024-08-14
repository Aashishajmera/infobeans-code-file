import { Route, Routes } from "react-router-dom";
import About from "./components/About.js";
import Home from "./components/Home.js";
import Navigation from "./components/Navigation.js";
import NewAbout from "./components/NewAbout.js";
import "./App.css";

function App() {
  return (
    <>
      <Navigation />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/about" element={<About />} />
        <Route path="/newAbout" element={<NewAbout />} />
      </Routes>
    </>
  );
}

export default App;
