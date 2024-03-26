import { validationResult } from "express-validator";
import Doctor from "../model/doctor.model.js";
import jwt from "jsonwebtoken";


// Doctor signUp 
export const SignUp = (req, res, next) => {
  const error = validationResult(req);
  if (!error.isEmpty()) return res.status(401).json({ error: error.array() });

  //   create method is used to store the data into the table
  Doctor.create({
    doctorName: req.body.name,
    email: req.body.email,
    password: req.body.password,
    contactNumber: req.body.contactNumber,
    registrationNumber: req.body.registrationNumber,
  })
    .then((result) => {
      return res
        .status(200)
        .json({ data: result.dataValues, message: "doctor data insert" });
    })
    .catch((err) => {
      return res.status(500).json({ error: "Internal server error", err });
    });
    
};

// Doctor signIn
export const SignIn = async (req, res, next) => {
    const errors = validationResult(req);
    if (!errors.isEmpty())
        return res.status(401).json({ error: errors.array() });

    let email = req.body.email;
    let password = req.body.password;

    let doctor = await Doctor.findOne({ where: { email: email }, raw: true });
    if (doctor) {
        if (Doctor.checkPassword(password, doctor.password)) {
            let payload = { subject: email };
            let token = jwt.sign(payload, 'fdfjfjrwieroerivxcnmvnnvrweiorddfsdfdlkfjlfjljlraj');
            return res.status(200).json({ message: "Sign In Success", doctor, token: token });
        } else {
            return res.status(401).json({ error: "Unauthorized doctor" });
        }
    }
    else
        return res.status(401).json({ error: "Unauthorized doctor" });
}