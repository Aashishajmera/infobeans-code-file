import { DataTypes } from "sequelize";
import { sequelize } from "../db/ConnectDb.js";

export const cart = sequelize.define("cart", {
  
  // categoryName: {
  //   type: DataTypes.STRING,
  //   allowNull: false,
  //   unique: true,
  //   primaryKey: true,
  // }

  id: {
    
    type: DataTypes.INTEGER,
    primaryKey: true,
    autoIncrement: true,
  },
});

sequelize
  .sync()
  .then(() => {
    console.log("Cart table create");
  })
  .catch((err) => {
    console.log("Category create time error....");
  });