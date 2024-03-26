import { Route, Routes } from "react-router-dom";
import "./App.css";
import About from "./components/About";
import Contact from "./components/Contact";
import Home from "./components/Home";
import ProductList from "./components/ProductList";
// import LifeCycle from "./components/LifeCycle";

function App() {
  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/about" element={<About />} />
      <Route path="/contact" element={<Contact />} />
      {/* <Route path="/lifeCycle" element={<LifeCycle/>} /> */}
      <Route path="/productList" element={<ProductList />} />
    </Routes>
  );
}

export default App;
