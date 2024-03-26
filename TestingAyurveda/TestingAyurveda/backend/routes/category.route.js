import express from "express";
import { fetchCategory, save, saveInBulk, search } from "../controller/category.controller.js";

const router = express.Router();

router.post("/save", save);
router.get("/search", search);
router.post("/save-in-bulk", saveInBulk);
router.get("/list", fetchCategory);

export default router; 