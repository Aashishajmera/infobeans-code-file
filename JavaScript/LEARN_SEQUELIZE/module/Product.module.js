import { sequelize } from '../db/ConnectDb.js';
import { DataTypes } from "sequelize";

export const ProductModle = sequelize.define("product", {
  id: {
    type: DataTypes.INTEGER,
    primaryKey: true,
    autoIncrement: true,
  },
  title: {
    type: DataTypes.STRING,
    allowNull: false,
  },
  description: {
    type: DataTypes.STRING,
    allowNull: false,
  },
  price: {
    type: DataTypes.FLOAT,
  },
  discountPercentage: {
    type: DataTypes.FLOAT,
  },
  rating: {
    type: DataTypes.FLOAT,
  },
  stock: DataTypes.INTEGER,
  brand: DataTypes.STRING,
  categoryname: DataTypes.STRING,
  thumbnail: DataTypes.STRING,
  imageArray: DataTypes.STRING(1000),
});

 
sequelize.sync().then(()=>{
    console.log("Product table successfully create....");
}).catch(err=>{
    console.log("Error in product table creation time"+ err);
});