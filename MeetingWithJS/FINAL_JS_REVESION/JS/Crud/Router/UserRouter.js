import express from 'express';
import { allUser, signIn, signUp } from '../Controller/UserController.js';
import { virifyToken } from '../TokenMiddleware/token.js';

export const userRouter = express.Router();

userRouter.post('/signUp', signUp);
console.log('router......');

userRouter.get('/alluser', allUser);
userRouter.post('/signIn', signIn);
userRouter.post('/checktoken', virifyToken);