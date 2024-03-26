import express from 'express';
import { SignUp, list, listbyemail, remove, signIn, update } from '../controller/user.controller.js';
import { verifyToken } from '../middleware/auth.js';
import { body } from 'express-validator';

const router = express.Router();

router.post("/signUp",
    body("email", "invalid email").isEmail().notEmpty(),
    body("password", "invalid password").notEmpty(),
    body("name", "invalid name").notEmpty(),
    body("contactNumber", "invalid contactNumber").isNumeric().notEmpty(),
    SignUp);

router.post("/signIn",
    body("email", "invalid email").isEmail().notEmpty(),
    body("password", "invalid password").notEmpty(),
    signIn);

router.put("/update",
    body("email", "invalid email").isEmail().notEmpty(),
    body("password", "invalid password").notEmpty(),
    body("name", "invalid name").notEmpty(),
    body("contactNumber", "invalid contactNumber").isNumeric().notEmpty(),
    update);

router.delete("/remove",
    body("email", "invalid email").isEmail().notEmpty(),
    remove);

router.get("/listbyemail",
    body("email", "invalid email").isEmail().notEmpty(),
    listbyemail);

router.get("/viewUserList", list);

export default router;