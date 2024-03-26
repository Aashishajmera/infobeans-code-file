import exress from "express";
import { body } from "express-validator";
import { SignIn, SignUp } from "../controller/doctor.controller.js";

const router = exress.Router();

router.post(
  "/signUp",
  body("name", "name must be 2 character").isLength({ min: 2 }),
  body("name", "name is required").notEmpty(),
  body("email", "Invalid email").isEmail(),
  body("email", "email is required").notEmpty(),
  body("password", "password must be 5 character").isLength({ min: 5 }),
  body("password", "password is required").notEmpty(),
  body("contactNumber", "contact number must be 10 digit").isLength({
    min: 10,
  }),
  body("contactNumber", "contact number is required").notEmpty(),
  body("registrationNumber", "registrationNumber is required").notEmpty(),
  SignUp
);

router.post(
  "/signIn",
  body("email", "Invalid email").isEmail(),
  body("email", "email is required").notEmpty(),
  body("password", "password must be 5 character").isLength({ min: 5 }),
  body("password", "password is required").notEmpty(), 
  SignIn
);

export default router;
