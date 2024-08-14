import bodyparser from 'body-parser';
import express from 'express';
import { connectionCreate } from "./ConnectDb/Connect_database.js";
import { userRouter } from './Router/UserRouter.js';


const app = express();


app.use(bodyparser.json());
app.use(bodyparser.urlencoded({extended: true}));


connectionCreate.then(()=>{

    app.use('/user', userRouter);

    app.listen(3000, ()=>{
        console.log('server started...');
    })
}).catch(err=>{
    console.log('Connection time error', err);
});