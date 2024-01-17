import express from 'express';
import { createCart } from '../controllers/Cart.controller.js';

const CartRouter = express.Router();


CartRouter.post('/createCart', createCart);

export default CartRouter;