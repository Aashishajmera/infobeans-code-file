import { DataTypes } from "sequelize";
import sequelize from "../db/dbConfig.js";

const Appointment = sequelize.define('appointment', {
    id: {
        type: DataTypes.INTEGER,
        allowNull: false,
        primaryKey: true,
        autoIncrement: true
    },
    appointmentDate: {
        type: DataTypes.STRING,
        allowNull: false
    },
    status: {
        type: DataTypes.STRING(15),
        allowNull: false
    },
    userId: {
        type: DataTypes.INTEGER,
        allowNull: true
    },
    doctorId: {
        type: DataTypes.INTEGER,
        allowNull: true
    }
});

sequelize.sync().then(() => {
    console.log("Appointment table created....");
}).catch(err => {
    console.log(err);
    console.log("Error in Appointment");
})
export default Appointment;