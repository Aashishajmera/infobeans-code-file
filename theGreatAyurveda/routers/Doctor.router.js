import express from 'express';
import { doctorList, signIn, signUp } from "../controllers/Doctor.controller.js";
import { verifyToken } from '../middleware/authorization.js';


// ROUTER LEVEL MIDDLEWARE 
export const DoctorRouter = express.Router();

// call the doctor signUp
DoctorRouter.post('/signUp', signUp);
hgfdsa
// call the doctor signIn
DoctorRouter.get('/signIn', signIn);

// call the doctor list
DoctorRouter.get('/doctorList',verifyToken, doctorList);