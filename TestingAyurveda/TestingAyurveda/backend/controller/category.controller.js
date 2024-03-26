import { validationResult } from "express-validator";
import Category from "../model/category.model.js";
import Product from "../model/product.model.js";

export const saveInBulk = async (request, response, next) => {
    try {
        let categoryList = request.body;
        for (let category of categoryList)
            await Category.create({ categoryName: category });
        return response.status(200).json({ message: "All Category Saved.." });
    }
    catch (err) {
        return response.status(500).json({ error: "Internal Server Error" });
    }
}

export const save = (request, response, next) => {
    const errors = validationResult(request);
    if (!errors.isEmpty())
        return response.status(401).json({ error: errors.array() });
    Category.create({ categoryName: request.body.categoryName })
        .then((result) => {
            return response.status(200).json({ data: result.dataValues, message: "category created..." });
        })
        .catch((err) => {
            return response.status(500).json({ error: "Internal server error...", err });
        })
}

export const search = (request, response, next) => {
    Category.findOne({ where: { categoryName: request.body.categoryName } })
        .then(result => {
            if (result)
                return response.status(200).json({ categories: result });
            return response.status(401).json({ error: "unauthorized request!" });
        }).catch(err => {
            return response.status(500).json({ error: "Internal server error" });
        })
}

export const fetchCategory = (request, response, next) => {
    Category.findAll({
        include: [{ model: Product, required: true }]
    }).then(result => {
        return response.status(200).json({ categories: result });
    }).catch(err => {
        return response.status(500).json({ error: "Internal server error" });
    })
}