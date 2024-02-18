import express from 'express';
import { doctorFeedback } from '../controllers/DoctorFeedback.controller.js';
import { verifyToken } from '../middleware/authorization.js';


// create a router
export const DoctorFeedbackRouter = express.Router();


// call the doctor feedback
DoctorFeedbackRouter.post('/doctorFeedback',verifyToken, doctorFeedback);
