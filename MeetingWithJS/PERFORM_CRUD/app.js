import mongoose, { mongo } from 'mongoose';
import bodyparser from 'body-parser';
import express from 'express';
import userRouter from './Router/UserRouter.js';


// create app level middleware
const app = express();


mongoose.connect('mongodb+srv://ajmeraaashu55:DwXOaQzBrlS3tP6l@cluster0.yyrl0w1.mongodb.net/Withimage').then(()=>{
    app.use(bodyparser.json());
    app.use(bodyparser.urlencoded({extended: true}));


    app.use('/user', userRouter);

    app.listen(3001, ()=>{
        console.log('server started.....');
    })
}).catch((err)=>{
    console.log('database connect time error...');
})