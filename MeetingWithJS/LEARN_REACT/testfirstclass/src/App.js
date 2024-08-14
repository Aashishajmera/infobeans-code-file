import { useState } from "react";
import "./App.css";
import AddTodo from "./Components/AddNewTodoComponent/AddTodo.js";
import Footer from "./Components/FooterComponent/Footer.js";
import Header from "./Components/HeaderComponent/Header.js";
import Todos from "./Components/TodosComponent/Todos.js";
import Update from "./Components/UpdateComponent/Update.js";

function App() {
  const [todos, setTodos] = useState([]);
  const [status, setStatus] = useState(false);
  const [update, setUpdate] = useState([]);
  const onDelete = (todo) => {
    console.log("I am ondelete", todo);
    setTodos(
      todos.filter((value) => {
        return value !== todo;
      })
    );
  };

  const onUpdate = (todo) => {
    setStatus(true);
    alert("update funcation called....");
    setUpdate([todo]);
    console.log(update);
  };

  const addTodoItems = (newTodo) => {
    setTodos([...todos, newTodo]);
  };

  return (
    <>
      <Header title="My_Todo_App" />
      <AddTodo addTodoItems={addTodoItems} todos={todos} />
      <Todos todos={todos} onDelete={onDelete} onUpdate={onUpdate} />
      {status && <Update onUpdate={onUpdate} update={update} todos={todos} setTodos={setTodos} setStatus={setStatus}/>}
      <Footer />
    </>
  );
}

export default App;
