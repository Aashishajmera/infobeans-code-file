import { sequelize } from "../db/ConnectDb.js";

export const cartItems = sequelize.define("cartItem", {});

sequelize
  .sync()
  .then(() => {
    console.log("Cartitems table create");
  })
  .catch((err) => {
    console.log("Cartitems table are not create", err);
  });
