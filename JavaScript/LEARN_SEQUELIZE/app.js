import bodyParser from 'body-parser';
import express from 'express';
import './module/Assosiation.js';
import { categoryRouter } from './router/Category.router.js';
import { ProductRouter } from './router/Product.router.js';
import { userRouter } from './router/User.router.js';

const app = express();

app.use(bodyParser.urlencoded({extended: true}));
app.use(bodyParser.json());


// USER ROUTER
app.use('/user', userRouter);

// CATEGORY ROUTER
app.use("/category", categoryRouter);

// PRODUCT ROUTER
app.use("/product", ProductRouter);


app.listen(3000, ()=>{
    console.log('Server started...');
});