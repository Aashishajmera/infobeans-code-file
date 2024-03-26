import express from "express";
import { Add, getProductByCategory, getProductList, removeProduct, saveInBulk, updateProduct, viewParticularProducts } from "../controller/product.controller.js";
import { body } from "express-validator";

const router = express.Router();

router.post("/addProduct",
    body("title", "invalid title").notEmpty(),
    body("brand", "invalid brand").notEmpty(),
    body("price", "invalid price").notEmpty(),
    body("description", "invalid description").notEmpty(),
    body("imageUrl", "invalid imageUrl").notEmpty(),
    body("categoryname", "invalid categoryname").notEmpty(),
    Add);

router.delete("/removeProduct", body("id", "invalid id").notEmpty(), removeProduct);

router.put("/updateProduct",
    body("id", "invalid id").notEmpty(),
    body("title", "invalid title").notEmpty(),
    body("brand", "invalid brand").notEmpty(),
    body("price", "invalid price").notEmpty(),
    body("description", "invalid description").notEmpty(),
    body("imageUrl", "invalid imageUrl").notEmpty(),
    body("categoryname", "invalid categoryname").notEmpty(),
    updateProduct);

router.get("/viewAllProducts", getProductList);

router.get("/viewParticularProducts", body("id", "invalid id").notEmpty(), viewParticularProducts);

router.get("/viewByCategory/:categoryName", getProductByCategory);

router.post("/save-in-bulk",
    body("id", "invalid id").notEmpty(),
    body("title", "invalid title").notEmpty(),
    body("brand", "invalid brand").notEmpty(),
    body("price", "invalid price").notEmpty(),
    body("description", "invalid description").notEmpty(),
    body("imageUrl", "invalid imageUrl").notEmpty(),
    body("categoryname", "invalid categoryname").notEmpty(),
    saveInBulk);

export default router;