import express from "express";
import {addCategory, deleteCategory, listCategory, viewParticular} from "../controllers/Category.controller.js";

const router = express.Router();


router.post('/addCategory', addCategory);
router.post('/listCategory', listCategory);
router.delete('/:deleteCategory', deleteCategory);
router.get('/:viewParticularId', viewParticular);
export default router;