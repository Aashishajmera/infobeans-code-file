import bodyParser from 'body-parser';
import express from 'express';
import AdminRouter from "./routers/Admin.router.js";
import CategoryRouter from './routers/Category.router.js';
import UserRouter from './routers/User.router.js';
import ProductRouter from './routers/Product.router.js';
import CartRouter from './routers/Cart.router.js';
import { CartItemsRouter } from './routers/CartItems.router.js';

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

// to call the product router
app.use('/product', ProductRouter)

// to call the cart router
app.use('/cart', CartRouter)

// to call the cartItems router
app.use('/cartItems', CartItemsRouter)

// create a server
app.listen(3000, ()=>{
    console.log("Server called.....");
})