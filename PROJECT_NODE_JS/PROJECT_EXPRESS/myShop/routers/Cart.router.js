import express from 'express';
import { addToCart, deleteProduct } from '../controllers/Cart.controller.js';
import { verifyToken } from '../middleware/authorization.js';

const CartRouter = express.Router();


CartRouter.post('/addToCart', verifyToken, addToCart);
CartRouter.delete('/:id', deleteProduct)

export default CartRouter;