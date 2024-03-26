import express from "express";
import { Add, Remove, Update, getYoga, getYogaByCategory, saveInBulk, viewParticularYoga } from "../controller/yoga.controller.js";
import { body } from "express-validator";

const router = express.Router();

router.post("/addYoga",
    body("yogaName", "invalid yogaName").notEmpty(),
    body("benefits", "invalid benefits").notEmpty(),
    body("instructions", "invalid instructions").notEmpty(),
    body("imageUrl", "invalid imageUrl").notEmpty(),
    body("videoUrl", "invalid videoUrl").notEmpty(),
    body("categoryname", "invalid categoryname").notEmpty(),
    Add);

router.delete("/removeYoga", body("id", "invalid id").notEmpty(),
    Remove);

router.put("/updateYoga",
    body("id", "invalid id").notEmpty(),
    body("yogaName", "invalid yogaName").notEmpty(),
    body("benefits", "invalid benefits").notEmpty(),
    body("instructions", "invalid instructions").notEmpty(),
    body("imageUrl", "invalid imageUrl").notEmpty(),
    body("videoUrl", "invalid videoUrl").notEmpty(),
    body("categoryname", "invalid categoryname").notEmpty(),
    Update);

router.get("/viewAllYoga", getYoga);

router.get("/viewParticularYoga", body("id", "invalid id").notEmpty(), viewParticularYoga);

router.get("/viewByCategory/:categoryName", getYogaByCategory);

router.post("/save-in-bulk",
    body("id", "invalid id").notEmpty(),
    body("yogaName", "invalid yogaName").notEmpty(),
    body("benefits", "invalid benefits").notEmpty(),
    body("instructions", "invalid instructions").notEmpty(),
    body("imageUrl", "invalid imageUrl").notEmpty(),
    body("videoUrl", "invalid videoUrl").notEmpty(),
    body("categoryname", "invalid categoryname").notEmpty(),
    saveInBulk);

export default router;