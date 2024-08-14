import bodyparser from 'body-parser';
import dotenv from 'dotenv';
import cors from 'cors';
import express from 'express';
import mongoose from 'mongoose';
import { itemRouter } from './Router/ItemRouter.js';

dotenv.config();
const app = express();


mongoose.connect(process.env.DATABASE_URL).then(()=>{

    app.use(bodyparser.json());
    app.use(bodyparser.urlencoded({extended: true}));
    app.use(cors());


    app.use(process.env.ALL_API, itemRouter);

    app.listen(3000, ()=>{
        console.log('server created...');
    })
}).catch(err=>{
    console.log('Data base connect time error.....');
})