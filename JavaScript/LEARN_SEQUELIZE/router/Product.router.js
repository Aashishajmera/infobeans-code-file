import express from 'express';
import { saveInBulkProduct } from '../controller/Product.controller.js';

export const ProductRouter = express.Router();

ProductRouter.post("/saveInBulkProduct", saveInBulkProduct);