import { Route, Routes } from "react-router-dom";
import "./App.css";
import About from "./components/About";
import Headers from "./components/Headers";
import Home from "./components/Home";
import NewProduct from "./components/NewProduct";
import NewTwo from "./components/NewTwo";
import Product from "./components/Product";

function App() {
  return (
    <>
      <Headers />
      <Routes>
        <Route path="home" element={<Home />} />
        <Route path="about" element={<About />} />
        {/* <Route path="product" element={<Product/>}>
              <Route path="newProduct" element={<NewProduct/>}/>
        </Route> */}

        <Route path="product" element={<Product />}>
          <Route path="newProduct" element={<NewProduct />} />
          <Route path="newTwo" element={<NewTwo/>}/>
        </Route>
      </Routes>
    </>
  );
}

export default App;