import express from "express";
import multer from "multer";
import {
    addProduct,
    deleteProduct,
    updateProduct,
    viewAllProduct,
    viewSameCategoryProduct,
} from "../controllers/Product.controller.js";
import { verifyToken } from "../middleware/authorization.js";

// to create a router
const router = express.Router();

// HOW
const upload = multer({dest: "public/images"});
// const upload = multer({dest: "../public/images"})

router.post("/addProduct",upload.single('imageUrl'),verifyToken, addProduct);
router.post("/updateProduct", verifyToken, updateProduct);
router.delete("/:deleteProductId", verifyToken,deleteProduct);
router.get("/viewAllProduct",verifyToken ,viewAllProduct);
router.get("/:categoryId",verifyToken, viewSameCategoryProduct);

export default router;