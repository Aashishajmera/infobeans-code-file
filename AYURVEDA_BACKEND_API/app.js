import bodyParser from 'body-parser';
import express from 'express';

const app = express();

app.use(bodyParser.urlencoded({extended: true}))
app.use(bodyParser.json());

// CREATE A SERVER
app.listen(3000, ()=>{
    console.log("Server called...");
})