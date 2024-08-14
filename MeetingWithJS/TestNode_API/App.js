import express from 'express';
import userRouter from './Router/UserRouter.js';
import bodyParser from 'body-parser';


// create a object of express

const app = express();

app.use(bodyParser.json())
app.use(bodyParser.urlencoded({extended: true}))


app.use("/User", userRouter);

// create the server 
app.listen(3000, ()=>{
    console.log("Create server.....");
})