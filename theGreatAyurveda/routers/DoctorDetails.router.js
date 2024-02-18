import express from "express";
import multer from "multer";
import { verifyDoctor } from "../controllers/DoctorDetails.controller.js";

// create a router of doctordetails
export const DoctorDetailsRouter = express.Router();

// HOW
const upload = multer({ dest: "public/images" });

DoctorDetailsRouter.post(
  "/verifyDoctor",
  upload.fields([{ name: "qualificationImage" }, { name: "imageUrl" }]),
  verifyDoctor
);
