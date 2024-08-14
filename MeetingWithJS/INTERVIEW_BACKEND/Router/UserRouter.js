import express from 'express';
import { deleteUser, getAllUser, signIn, signUp, updateUser } from '../Controller/UserController.js';

export const userRouter = express.Router();

userRouter.post('/signUp', signUp);

userRouter.post('/signIn', signIn);

userRouter.get('/allUser', getAllUser)

userRouter.delete('/delete' ,deleteUser);

userRouter.put('/update', updateUser);