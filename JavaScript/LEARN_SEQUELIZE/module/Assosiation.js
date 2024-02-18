import { Category } from "./Category.module.js";
import { ProductModle } from "./Product.module.js";

console.log("Assosication called.....");

Category.hasMany(ProductModle, {
    foreignKey: 'categoryname'
});

ProductModle.belongsTo(Category, {
    foreignKey: 'categoryname'
})


export {Category, ProductModle}