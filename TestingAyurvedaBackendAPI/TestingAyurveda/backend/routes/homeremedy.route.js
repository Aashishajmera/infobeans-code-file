import express from "express";
import { Add, Remove, Update, getHomeRemedy, getHomeRemedyByCategory, saveInBulk, viewParticularHomeremedy } from "../controller/homeremedy.controller.js";
import { body } from "express-validator";

const router = express.Router();

router.post("/addHomeremedy",
    body("remedyName", "invalid remedyName").notEmpty(),
    body("description", "invalid description").notEmpty(),
    body("ingredients", "invalid ingredients").notEmpty(),
    body("instructions", "invalid instructions").notEmpty(),
    body("imageUrl", "invalid imageUrl").notEmpty(),
    body("caution", "invalid caution").notEmpty(),
    body("categoryname", "invalid categoryname").notEmpty(),
    Add);

router.delete("/removehomeremedy", body("id", "invalid id").notEmpty(), Remove);

router.put("/updatehomeremedy", body("remedyName", "invalid remedyName").notEmpty(),
    body("id", "invalid id").notEmpty(),
    body("description", "invalid description").notEmpty(),
    body("ingredients", "invalid ingredients").notEmpty(),
    body("instructions", "invalid instructions").notEmpty(),
    body("imageUrl", "invalid imageUrl").notEmpty(),
    body("caution", "invalid caution").notEmpty(),
    body("categoryname", "invalid categoryname").notEmpty(),
    Update);

router.get("/viewAllHomeremedy", getHomeRemedy);

router.get("/viewParticularHomeremedy", body("id", "invalid id").notEmpty(), viewParticularHomeremedy);

router.get("/viewByCategory/:categoryName", getHomeRemedyByCategory);

router.post("/save-in-bulk", body("remedyName", "invalid remedyName").notEmpty(),
    body("description", "invalid description").notEmpty(),
    body("ingredients", "invalid ingredients").notEmpty(),
    body("instructions", "invalid instructions").notEmpty(),
    body("imageUrl", "invalid imageUrl").notEmpty(),
    body("caution", "invalid caution").notEmpty(),
    body("categoryname", "invalid categoryname").notEmpty(),
    saveInBulk);

export default router;