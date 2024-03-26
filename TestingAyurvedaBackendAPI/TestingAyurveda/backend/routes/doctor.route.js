import express from 'express';
import { verifyToken } from '../middleware/auth.js';
import { body } from 'express-validator';
import { AddDoctorDetail, SignUp, UpdateDoctorDetail, appointment, appointmentDetailslist, appointmentDetailsperticular, appointmentlist, doctordata, doctordatabyemail, list, listbyemail, remove, signIn, update, updateAppointmentStatus } from '../controller/doctor.controller.js';

const router = express.Router();

router.post("/signUp",
    body("email", "invalid email").isEmail().notEmpty(),
    body("password", "invalid password").notEmpty(),
    body("doctorName", "invalid doctorName").notEmpty(),
    body("contactNumber", "invalid contactNumber").isNumeric().notEmpty(),
    body("registrationNumber", "invalid registrationNumber").notEmpty(),
    SignUp);

router.post("/signIn",
    body("email", "invalid email").isEmail().notEmpty(),
    body("password", "invalid password").notEmpty(),
    signIn);

router.get("/viewDoctorList", list);

router.get("/listbyemail", body("email", "invalid email").isEmail().notEmpty(), listbyemail);

router.delete("/remove", body("email", "invalid email").isEmail().notEmpty(), remove);

router.put("/updateProfile",
    body("email", "invalid email").isEmail().notEmpty(),
    body("password", "invalid password").notEmpty(),
    body("doctorName", "invalid name").notEmpty(),
    body("contactNumber", "invalid contactNumber").notEmpty(),
    body("registrationNumber", "invalid registrationNumber").notEmpty(),
    update);

router.post("/addDoctordetail",
    body("qualificationImage", "invalid qualificationImage").notEmpty(),
    body("experience", "invalid experience").notEmpty(),
    body("gender", "invalid gender").notEmpty(),
    body("language", "invalid language").notEmpty(),
    body("clinicAddress", "invalid clinicAddress").notEmpty(),
    body("doctorimage", "invalid doctorimage").notEmpty(),
    body("specialization", "invalid specialization").notEmpty(),
    body("doctorId", "invalid doctorId").notEmpty(),
    AddDoctorDetail);

router.get("/doctordata", doctordata);

router.get("/doctorProfile", body("email", "invalid email").notEmpty(), doctordatabyemail);

router.put("/updateDoctordetail",
    body("id", "invalid id").notEmpty(),
    body("qualificationImage", "invalid qualificationImage").notEmpty(),
    body("experience", "invalid experience").notEmpty(),
    body("gender", "invalid gender").notEmpty(),
    body("language", "invalid language").notEmpty(),
    body("clinicAddress", "invalid clinicAddress").notEmpty(),
    body("doctorimage", "invalid doctorimage").notEmpty(),
    body("specialization", "invalid specialization").notEmpty(),
    body("doctorId", "invalid doctorId").notEmpty(),
    UpdateDoctorDetail);

router.post("/doctorAppointment",
    body("appointmentDate", "invalid appointmentDate").notEmpty(),
    body("status", "invalid status").notEmpty(),
    body("userId", "invalid userId").notEmpty(),
    body("doctorId", "invalid doctorId").notEmpty(),
    appointment);

router.get("/viewAppointmentList", appointmentlist);

router.get("/appointmentDetailslist", appointmentDetailslist);

router.get("/appointmentDetailsperticular", body("id", "invalid id").notEmpty(), appointmentDetailsperticular);

router.put("/updateAppointmentStatus",
    body("id", "invalid id").notEmpty(),
    body("status", "invalid status").notEmpty(),
    updateAppointmentStatus); 

export default router;