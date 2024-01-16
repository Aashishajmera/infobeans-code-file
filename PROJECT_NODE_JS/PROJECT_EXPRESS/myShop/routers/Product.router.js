import express from "express";
import {
  addProduct,
  deleteProduct,
  updateProduct,
  viewAllProduct,
  viewSameCategoryProduct,
} from "../controllers/Product.controller.js";

// to create a router
const router = express.Router();


router.post("/addProduct", addProduct);
router.post("/updateProduct", updateProduct);
router.delete("/:deleteProductId", deleteProduct);
router.get("/viewAllProduct", viewAllProduct);
router.get("/:categoryId", viewSameCategoryProduct);

export default router;
