import logo from './logo.svg';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import SignIn from './Components/SignIn';
import SignUp from "./Components/SignUp"
import 'react-toastify/dist/ReactToastify.css'
import Home from './Components/Home';
import Auth from './Components/Auth';
import ViewProduct from './Components/viewProduct';
import ViewCart from './Components/ViewCart';

function App() {
  return <>
    <Routes>
      <Route path='/' element={<SignIn/>}/>
      <Route path='/signup' element={<SignUp/>}/>
      <Route path='/home' element={<Auth><Home/></Auth>}/>
      <Route path='/viewProductDetails' element={<ViewProduct/>}></Route>
      <Route path='viewCart' element={<ViewCart/>}></Route>
    </Routes>
  </>
}


export default App;

