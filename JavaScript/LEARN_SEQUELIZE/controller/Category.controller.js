import { response } from "express";
import { Category } from "../module/Category.module.js";
import { ProductModle } from "../module/Product.module.js";

export const saveInBulk = async (req, res, next) => {
  try {
    const categoryList = req.body;
    for (let category of categoryList)
      await Category.create({ categoryName: category });
    return res.status(200).json({ message: "All category saved..." });
  } catch (error) {
    return res.status(500).json({ error: "Internal server error...", error });
  }
};

export const fetchCategory = (req, res, next) => {
  Category.findAll({ include: [{ model: ProductModle, required: true }] })
    .then((result) => {
      return response.status(200).json({ categories: result });
    })
    .catch((err) => {
      return res.status(500).json({ err: "Internal server error", err });
    });
};
