import { ProductModle } from "../module/Product.module.js";

export const saveInBulkProduct = async (req, res, next) => {
  try {
    let productList = req.body.products;

    for (let product of productList) {
      let {
        id,
        title,
        description,
        price,
        discountPercentage,
        rating,
        stock,
        thumbnail,
        brand,
      } = product;

      let categoryname = product.category;
      let imageArray = "";

      for (let imageUrl of product.images)
        imageArray = imageArray + imageUrl + "";

      await ProductModle.create({
        id,
        title,
        description,
        price,
        discountPercentage,
        rating,
        stock,
        thumbnail,
        brand,
        categoryname,
        imageArray,
      });
    }
    return res.status(200).json({ message: "All product saved..." });
  } catch (err) {
    return res.status(500).json({ err: "Internal server err...", err });
  }
};
