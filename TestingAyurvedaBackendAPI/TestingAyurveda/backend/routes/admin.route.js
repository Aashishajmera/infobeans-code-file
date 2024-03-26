import express from 'express';
import { body } from 'express-validator';
import { verifyToken } from '../middleware/auth.js';
import { SignUp, list, listbyemail, remove, signIn, update } from '../controller/admin.controller.js';

const router = express.Router();

router.post("/signUp",
    body("email", "invalid email").isEmail().notEmpty(),
    body("password", "invalid password").notEmpty(),
    body("name", "invalid name").notEmpty(),
    SignUp);

router.post("/signIn",
    body("email", "invalid email").isEmail().notEmpty(),
    body("password", "invalid password").notEmpty(),
    signIn);

router.put("/update",
    body("id", "invalid id").notEmpty(),
    body("email", "invalid email").isEmail().notEmpty(),
    body("password", "invalid password").notEmpty(),
    body("name", "invalid name").notEmpty(),
    update);

router.delete("/remove", body("email", "invalid email").isEmail().notEmpty(), remove);

router.get("/listbyemail", body("email", "invalid email").isEmail().notEmpty(), listbyemail);

router.get("/list", list);

export default router;