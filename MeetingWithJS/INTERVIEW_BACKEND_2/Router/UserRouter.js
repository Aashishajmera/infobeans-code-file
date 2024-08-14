import express from 'express';
import { signIn, singUp } from '../Controller/UserController.js';

export const userRouter = express.Router();


userRouter.post('/signUp', singUp);

userRouter.post('/singIn', signIn);