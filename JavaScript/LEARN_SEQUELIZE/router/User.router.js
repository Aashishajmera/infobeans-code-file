import express from "express";
import { body } from "express-validator";
import {
  addUser,
  removeUser,
  signIn,
  updateUser,
  userList,
} from "../controller/User.controller.js";

// to create a router
export const userRouter = express.Router();

// to validate the data
userRouter.post(
  "/addUser",
  body("email", "Invalid email").isEmail(),
  body("password", "Invalid pass..").notEmpty(),
  body("password", "minimum length require").isLength({ min: 5}),
  addUser
);

userRouter.get("/userList", userList);

userRouter.delete("/removeUser", removeUser);

userRouter.put("/updateUser", updateUser);

userRouter.get("/signIn", signIn);