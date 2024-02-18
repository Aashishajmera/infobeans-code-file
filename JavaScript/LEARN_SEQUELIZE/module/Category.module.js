import { DataTypes } from "sequelize";
import { sequelize } from "../db/ConnectDb.js";

export const Category = sequelize.define('category', {
    categoryName: {
        type: DataTypes.STRING,
        allowNull: false,
        primaryKey: true
    }
})  