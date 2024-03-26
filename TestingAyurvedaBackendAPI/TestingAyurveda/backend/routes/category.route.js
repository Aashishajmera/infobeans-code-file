import express from "express";
import { fetchAllCategory, fetchCategory, save, saveInBulk, search } from "../controller/category.controller.js";
import { body } from "express-validator";

const router = express.Router();

router.post("/addCategory", body("categoryName", "invalid categoryName").notEmpty(), save);

router.get("/search", body("categoryName", "invalid categoryName").notEmpty(), search);

router.get("/list", fetchCategory);

router.get("/listall", fetchAllCategory);

router.post("/save-in-bulk", body("categoryName", "invalid categoryName").notEmpty(), saveInBulk);

export default router; 