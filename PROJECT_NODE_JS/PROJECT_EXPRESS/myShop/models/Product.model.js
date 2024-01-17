import pool from "../connectDb/databaseCon.js";

class Product {
  constructor(id, title, brand, price, description, imageUrl, categoryId) {
    this.id = id;
    this.title = title;
    this.brand = brand;
    this.price = price;
    this.description = description;
    this.imageUrl = imageUrl;
    this.categoryId = categoryId;
  }

  // ADD PRODUCT
  addProduct() {
    return new Promise((resolve, reject) => {
      pool.getConnection((err, con) => {
        if (err) {
          console.log("Connection not stablished...");
          reject(err);
        } else {
          const sql =
            "insert into product(title, brand, price, description, imageUrl, categoryId) values(?,?,?,?,?,?)";
          con.query(
            sql,
            [
              this.title,
              this.brand,
              this.price,
              this.description,
              this.imageUrl,
              this.categoryId,
            ],
            (err, result) => {
              if (err) {
                console.log("data not insert" + err);
                reject(err);
              } else {
                resolve(result);
              }
            }
          );
        }
      });
    });
  }

  //   UPDATE PRODUCT
  updateProduct() {
    return new Promise((resolve, reject) => {
      pool.getConnection((err, con) => {
        if (err) {
          console.log("Connection not stablished..." + err);
          reject(err);
        } else {
          const sql = "update product set title = ? where id = ?";
          con.query(sql, [this.title, this.id], (err, result) => {
            if (err) {
              console.log("data update time err" + err);
              reject(err);
            } else {
              console.log("Data successfully update");
              resolve(result);
            }
          });
        }
      });
    });
  }

  //   DELETE PRODUCT
  static deleteProduct(id) {
    return new Promise((resolve, reject) => {
      pool.getConnection((err, con) => {
        if (err) {
          console.log("Connection time error", err);
          reject(err);
        } else {
          const sql = "delete from product where id = ?";
          con.query(sql, [id], (err, result) => {
            if (err) {
              console.log("Data not delete" + err);
              reject(err);
            } else {
              console.log("Data successfully delete");
              resolve(result);
            }
          });
        }
      });
    });
  }

  //   VIEW ALL PRODUCT
  static viewAllProduct() {
    return new Promise((resolve, reject) => {
      pool.getConnection((err, con) => {
        if (err) {
          console.log("Connection time err" + err);
          reject(err);
        } else {
          const sql = "select * from product";
          con.query(sql, (err, result) => {
            if (err) {
              console.log("Data get time error" + err);
              reject(err);
            } else {
              // console.log(result.affectedRows);
              console.log(result);
              resolve(result);
            }
          });
        }
      });
    });
  }

  //   VIEW SAME CATEGORY PRODUCT
  static viewSameCategoryProduct(categoryId) {
    return new Promise((resolve, reject) => {
      pool.getConnection((err, con) => {
        if (err) {
          console.log("Connection not stablished....");
          reject(err);
        } else {
          const sql =
            "select product.id, product.title,  product.brand, product.price, product.description, product.imageUrl, category.categoryName from product inner join category on product.categoryId = category.id where category.id = ?";
            //  where product.categoryId = ?
          con.query(sql, [categoryId], (err, result) => {
            if (err) {
              console.log("Data not check");
              reject(err);
            } else {
              console.log("Data successfully get");
              console.log("Result is: ", result);
              resolve(result);
            }
          });
        }
      });
    });
  }


}

export default Product;
