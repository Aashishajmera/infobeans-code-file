import { DataTypes } from "sequelize";
import sequelize from "../db/dbConfig.js";

const Product = sequelize.define('product', {
    id: {
        type: DataTypes.INTEGER,
        allowNull: false,
        primaryKey: true,
        autoIncrement: true
    },
    title: {
        type: DataTypes.STRING(50),
        allowNull: false
    },
    brand: {
        type: DataTypes.STRING(50),
        allowNull: false
    },
    price: {
        type: DataTypes.DECIMAL(10, 2),
        allowNull: false
    },
    description: {
        type: DataTypes.STRING(500),
        allowNull: false
    },
    imageUrl: {
        type: DataTypes.STRING(500),
        allowNull: false
    },
    categoryname: {
        type: DataTypes.STRING,
        allowNull: true,
    }
});

sequelize.sync().then(() => {
    console.log("Product table created....");
}).catch(err => {
    console.log(err);
    console.log("Error in Product");
})
export default Product;