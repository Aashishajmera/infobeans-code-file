import express from "express";
import signUp, { signIn } from "../Controller/UserController.js";

const userRouter = express.Router();

userRouter.post("/signUp", signUp);
userRouter.get("/signIn", signIn);

export default userRouter;
