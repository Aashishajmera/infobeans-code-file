import bodyParser from 'body-parser';
import express from 'express';
import AdminRouter from "./routers/Admin.router.js";
import CategoryRouter from './routers/Category.router.js';
import UserRouter from './routers/User.router.js';

// create a object of express
const app = express();

app.use(bodyParser.urlencoded({extended: true}));
app.use(bodyParser.json());

// to call the admin router
app.use('/admin', AdminRouter);

// app.use((req, res, next)=>{

// })

// to call the user router
app.use("/user", UserRouter)

// to call the category router
app.use('/category', CategoryRouter)

// create a server
app.listen(3000, ()=>{
    console.log("Server called.....");
})