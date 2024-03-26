import express from "express";
import {
  SignUp,
  list,
  listbyemail,
  remove,
  signIn,
  update,
} from "../controller/user.controller.js";
import { verifyToken } from "../middleware/auth.js";
import { body, check } from "express-validator";

const router = express.Router();

router.post(
  "/signUp",
  body("email", "invalid email").isEmail(),
  body("email", "email is require").notEmpty(),
  body("password", "password at lest 5 letter").isLength({ min: 5 }),
  body("password", "password is require").notEmpty(),
  body("name", "name contains only letters").isAlpha(),
  body("name", "name is require").notEmpty(),
  body("contactNumber", "contact number must me 10 digit").isLength({
    min: 10,
  }),
  body("contactNumber", "contact number is require").notEmpty(),
  SignUp
);

router.post(
  "/signIn",
  body("email", "invalid email").isEmail(),
  body("email", "email is require").notEmpty(),
  body("password", "invalid password").isLength({ min: 5 }),
  body("password", "password is require").notEmpty(),
  signIn
);

router.get("/list", verifyToken, list);

router.get(
  "/listbyemail",
  verifyToken,
  check("email", "invalid email").isEmail(),
  check("email", "email is require").notEmpty(),
  listbyemail
);

router.delete(
  "/remove",
  verifyToken,
  body("email", "invalid email").isEmail(),
  body("email", "email is require").notEmpty(),
  remove
);

router.put(
  "/update",
  verifyToken,
  body("id", "invalid id").isNumeric(),
  body("id", "id is require").notEmpty(),
  body("email", "invalid email").isEmail(),
  body("email", "email is require").notEmpty(),
  body("password", "password at lest 5 letter").isLength({ min: 5 }),
  body("password", "password is require").notEmpty(),
  body("name", "name contains only letters").isAlpha(),
  body("name", "name is require").notEmpty(),
  update
);

export default router;
