import { DataTypes } from "sequelize";
import sequelize from "../db/dbConfig.js";
import bcyrpt from "bcryptjs";

// define method is used to create a table in database
const Doctor = sequelize.define("Doctor", {
  id: {
    type: DataTypes.INTEGER,
    primaryKey: true,
    autoIncrement: true,
  },
  doctorName: {
    type: DataTypes.STRING,
    allowNull: false,
  },
  email: {
    type: DataTypes.STRING,
    allowNull: false,
    unique: true,
  },
  password: {
    type: DataTypes.STRING,
    allowNull: false,
    set(value) {
      let saltkey = bcyrpt.genSaltSync(10);
      let encryptedPassword = bcyrpt.hashSync(value, saltkey);
      this.setDataValue("password", encryptedPassword);
    },
  },
  contactNumber: {
    type: DataTypes.STRING,
    allowNull: false,
    unique: true,
  },
  registrationNumber: {
    type: DataTypes.INTEGER,
    allowNull: false,
    unique: true,
  },
});

Doctor.checkPassword = (originalPassword, encryptedPassword) => {
  console.log("check Password called....");
  return bcyrpt.compareSync(originalPassword, encryptedPassword);
};

sequelize
  .sync()
  .then(() => {
    console.log("Doctor table created....");
  })
  .catch((err) => {
    console.log("something wrong....");
    console.log(err);
  });

export default Doctor;
