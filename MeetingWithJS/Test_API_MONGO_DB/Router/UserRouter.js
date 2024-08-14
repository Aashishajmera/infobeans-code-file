import express from "express";
import { signIn, signUp, update } from "../Controller/UserController.js";

export const userRouter = express.Router();

userRouter.post("/signUp", signUp);

userRouter.post('/signIn', signIn);

userRouter.put('/updateUser', update);