import { DataTypes } from "sequelize";
import sequelize from "../db/dbConfig.js";

const DoctorFeedback = sequelize.define('doctorfeedback',{
    id: {
        type: DataTypes.INTEGER,
        allowNull: false,
        primaryKey: true,
        autoIncrement: true
    }, 
    ratingStar: {
        type: DataTypes.INTEGER,
        allowNull: false, 
    }, 
    reviewText: {
        type: DataTypes.STRING,
        allowNull: false,
    }, 
    appointmentId: {
        type: DataTypes.INTEGER,
        allowNull: false
    },
    userId: {
        type: DataTypes.INTEGER,
        allowNull: false
    }, 
    doctorId: {
        type: DataTypes.INTEGER,
        allowNull: false
    }
})

sequelize.sync().then(() => {
    console.log("DoctorFeedback table created....");
}).catch(err => {
    console.log(err);
    console.log("Error in DoctorFeedback table");
})
export default DoctorFeedback;