import express from "express";
import { saveInBulk } from "../controller/Category.controller.js";

// create a router
export const categoryRouter = express.Router();

categoryRouter.post("/save-in-bulk", saveInBulk);