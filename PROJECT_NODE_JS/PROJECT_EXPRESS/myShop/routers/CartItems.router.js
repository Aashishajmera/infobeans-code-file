import express from 'express';
import { addToCart, deleteProduct } from '../controllers/CartItems.controller.js';


// to create a router
export const CartItemsRouter = express.Router();

// call the addToCart router
CartItemsRouter.post('/addToCart', addToCart);
CartItemsRouter.delete('/:id', deleteProduct)
