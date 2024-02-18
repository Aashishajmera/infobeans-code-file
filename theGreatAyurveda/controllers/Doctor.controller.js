import Doctor from "../modules/Doctor.module.js";
import jwt from "jsonwebtoken";

// DOCTOR SIGNUP MIDDLEWARE
export const signUp = (req, res) => {
  const doctorName = req.body.doctorName;
  const email = req.body.email;
  const password = req.body.password;
  const contactNumber = req.body.contactNumber;
  const registrationNumber = req.body.registrationNumber;

  // CREATE A OBJECT OF DOCTOR MODULE
  const doctor = new Doctor(
    null,
    doctorName,
    email,
    password,
    contactNumber,
    registrationNumber
  );

  doctor
    .signUp()
    .then((result) => {
      return res.status(201).json({ message: "SignUp successfull...", result });
    })
    .catch((err) => {
      return res.status(500).json({ err: "Internal server error...", err });
    });
};

// DOCTOR SIGNIN MIDDLEWARE
export const signIn = (req, res) => {
  const email = req.body.email;
  const password = req.body.password;

  const doctor = new Doctor();

  // set email and password
  doctor.email = email;
  doctor.password = password;

  doctor
    .signIn()
    .then((result) => {
      if (result.length != 0) {
        const payload = { email };
        const token = jwt.sign(payload, "anyword");
        return res
          .status(200)
          .json({ message: "signIn successfull...", data: result, token });
      } else
        return res
          .status(200)
          .json({ message: "signIn faild...", data: result });
    })
    .catch((err) => {
      return res.status(400).json({ err: "signIn faild...", err });
    });
};

// DOCTORLIST MIDDLEWARE
export const doctorList = (req, res) => {
  Doctor.doctorList()
    .then((result) => {
      if (result.length != 0)
        return res.status(200).json({ message: "Doctor list", list: result });
      else return res.status(400).json({ message: "empty list", result });
    })
    .catch((err) => {
      return res.status(400).json({ err: err });
    });
};
