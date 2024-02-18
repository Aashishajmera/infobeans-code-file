import Category from "../models/Category.model.js";

// ADD ITEMS
export const addCategory = (req, res, next) => {
  const categoryName = req.body.categoryName;

  // create a object of category module
  const category = new Category(null, categoryName);

  category
    .addCategory()
    .then((result) => {
      return res.status(201).json({ message: "Category name added..." });
    })
    .catch((err) => {
      return res.status(401).json({ err: "Category name not added...." });
    });
  // res.end();
};

// VIEW LIST OF ITEM
export const listCategory = (req, res, next) => {
  // in the category module this method is static so i call the directory with the help of class name
  Category.listCategory()
    .then((result) => {
      console.log(typeof result);
      console.log("000000000000");
      return res
        .status(201)
        .json({ message: "Data successfully get", data: result });
    })
    .catch((err) => {
      return res.status(501).json({ err: "Server side error: " });
    });

  //   res.end();
};

// DELETE CATEGORY
export const deleteCategory = (req, res, next) => {
  const id = req.params.deleteCategory;

  Category.deleteCategory(id)
    .then((result) => {
      if (result.affectedRows != 0) {
        return res.status(201).json({ message: "data successfully delete" });
      } else {
        return res
          .status(400)
          .json({ message: "Bad Request/category not found" });
      }
    })
    .catch((err) => {
      return res.status(401).json({ err: "server side error: " });
    });
  //   res.end();
};

// VIEW PARTICULAR CATEGORY
export const viewParticular = (req, res, next) => {
  const id = req.params.viewParticularId;

  Category.viewParticular(id)
    .then((result) => {
      if (result.affectedRows != 0) {
        return res.status(200).json({ message: "Data is: ", data: result });
      } else {
        return res.status(401).json({ err: "Item not found: " });
      }
    })
    .catch((err) => {
      return res.status(400).json({ err: "Server side err.." });
    });
};