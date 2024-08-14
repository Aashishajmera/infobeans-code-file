import express from "express";
import { signUp } from "../Controller/UserController.js";

// create a router level middleware
const userRouter = express.Router();
console.log("i am router");

userRouter.post("/signup", signUp);

export default userRouter;
