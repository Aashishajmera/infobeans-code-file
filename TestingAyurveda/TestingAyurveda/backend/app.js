import bodyParser from 'body-parser';
import cors from 'cors';
import express from 'express';
import './model/association.js';
import AdminRouter from './routes/admin.route.js';
import CartRouter from './routes/cart.route.js';
import CategoryRouter from './routes/category.route.js';
import DoctorRouter from './routes/doctor.router.js';
import ProductRouter from './routes/product.route.js';
import UserRouter from './routes/user.route.js';

const app = express();

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());
app.use(cors());

app.use('/admin', AdminRouter);
app.use('/user', UserRouter);
app.use('/category', CategoryRouter);
app.use('/product', ProductRouter);
app.use('/cart', CartRouter);


// ===================DOCTOR====================
app.use("/doctor", DoctorRouter);
app.listen(3000, () => { console.log("server started.....") })