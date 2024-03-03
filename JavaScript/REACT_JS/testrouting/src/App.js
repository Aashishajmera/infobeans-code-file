import { Route, Routes } from "react-router-dom";
import "./App.css";
import Header from "./components/Header";
import About from "./components/About";

function App() {
  return (
   <Routes>
    <Route path="/" element={<Header/>}/> 
    <Route path="/about" element={<About/>}/>
   </Routes>
  );
}

export default App;
