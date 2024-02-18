import express from 'express';
import { appointment, appointmentHistory, appointmentList, manageAppointment } from '../controllers/Appointment.controller.js';
import { verifyToken } from '../middleware/authorization.js';

// create a appointment router
export const AppointmentRouter = express.Router();
 
AppointmentRouter.post('/appointment',verifyToken, appointment);

AppointmentRouter.get('/appointmentHistory',verifyToken, appointmentHistory);

AppointmentRouter.get('/appointmentList',verifyToken, appointmentList);

AppointmentRouter.get('/manageAppointment',verifyToken, manageAppointment)