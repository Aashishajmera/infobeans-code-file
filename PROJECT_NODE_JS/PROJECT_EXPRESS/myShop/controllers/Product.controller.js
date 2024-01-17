import Product from "../models/Product.model.js";

// ADD PRODUCT
export const addProduct = (req, res, next) => {
  // get data into client
  // const {id, title, brand, price, description, imageUrl, category} = req.body;
  const title = req.body.title;
  const brand = req.body.brand;
  const price = req.body.price;
  const description = req.body.description;
  const imageUrl = req.body.imageUrl;
  const categoryId = req.body.categoryId;

  //   create a object of product model
  const product = new Product(
    null,
    title,
    brand,
    price,
    description,
    imageUrl,
    categoryId
  );

  product
    .addProduct()
    .then((result) => {
      return res.status(200).json({ message: "product successfully added.." });
    })
    .catch((err) => {
      return res.status(500).json({ err: "Server side error" });
    });
};

// UPDATE PRODUCT
export const updateProduct = (req, res, next) => {
  const title = req.body.title;
  const id = req.body.id;

  // to create a object of product model
  const product = new Product(id, title);
  product
    .updateProduct()
    .then((result) => {
      return res.status(201).json({ message: "Data successfully update..." });
    })
    .catch((err) => {
      return res.status(501).json({ err: "Data not update...." });
    });
};

// DELETE PRODUCT
export const deleteProduct = (req, res, next) => {
  const id = req.params.deleteProductId;
  Product.deleteProduct(id)
    .then((result) => {
      return res.status(201).json({ message: "Product successfully delete.." });
    })
    .catch((err) => {
      return res.status(501).json({ err: "Product not delete" });
    });
};

// VIEW ALL PRODUCT
export const viewAllProduct = (req, res) => {
  Product.viewAllProduct()
    .then((result) => {
      return res.status(200).json({ message: "Product list: ", list: result });
    })
    .catch((err) => {
      return res.status(500).json({ err: "Server side error: " });
    });
};

// VIEW SAME CATEGORY PRODUCT
export const viewSameCategoryProduct = (req, res) => {
    // create a object of product table
const categoryId = req.params.categoryId;
  Product.viewSameCategoryProduct(categoryId)
    .then((result) => {
        if(result.affectedRows != 0){
            return res.status(200).json({message: 'Data is: ', data: result})
        }else{
            return res.status(401).json({err: "Item not found: "})
        }
    })
    .catch((err) => {
      return res.status(500).json({ err: "Internal server error...." });
    });
};

