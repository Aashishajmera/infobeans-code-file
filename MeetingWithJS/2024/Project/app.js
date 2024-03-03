import AdminRouter from './router/Admin.router.js';
import express from 'express';
import bodyParser from 'body-parser';


// APP LEVEL MIDDLEWARE
const app = express();

app.use(bodyParser.urlencoded({extended: true}));
app.use(bodyParser.json());


app.use('/admin', AdminRouter);


app.listen(3000, ()=>{
    console.log("Server called.....");
})