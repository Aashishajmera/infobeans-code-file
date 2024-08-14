import logo from './logo.svg';
import './App.css';
import {Routes, Route} from 'react-router-dom';
import Home from './components/Home';

function App() {
  return (
    <>
      <h1>Hii, I am App.js.....</h1>
      <Routes>
        <Route path='/' element={<Home/>}/>
      </Routes>
    </>
  );
}

export default App;
