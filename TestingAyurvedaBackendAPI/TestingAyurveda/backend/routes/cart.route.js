import express from "express";
import { addToCart, fetchCartItems, getProductFromCartItems, removeFromCart } from "../controller/cart.controller.js";
const router = express.Router();

router.post("/addToCart",addToCart);

router.get("/listByUserId", fetchCartItems);

router.get("/list/:userId",fetchCartItems);

router.get("/getcart/:userId", getProductFromCartItems);

router.delete("/remove-from-cart/:userId/:productId",removeFromCart);

export default router;