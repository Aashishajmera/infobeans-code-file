import bcyrpt from 'bcryptjs';
import { DataTypes } from "sequelize";
import { sequelize } from "../db/ConnectDb.js";

export const User = sequelize.define("user", {
  id: {
    type: DataTypes.INTEGER,
    primaryKey: true,
    autoIncrement: true,
  },
  name: {
    type: DataTypes.STRING,
    allowNull: false,
  },
  email: {
    type: DataTypes.STRING,
    allowNull: false,
    unique: true,
  },
  password: {
    type: DataTypes.STRING(10),
    allowNull: false,
    unique: true,
    set(value){
        let saltkey = bcyrpt.genSaltSync(10);
        let encryptedPassword = bcyrpt.hashSync(value, saltkey);
        this.setDataValue('password', encryptedPassword);
    }
  },
});

// check the password of encyrept or decyrept password are same or not
User.checkPassword = (originalPassword, encryptedPassword)=>{
    console.log("Check the password....");
    // console.log(bcyrpt.compareSync(originalPassword, encryptedPassword)); 
    return bcyrpt.compareSync(originalPassword, encryptedPassword);  // its return true or false
}

// sync function is used to create the table where table is exist so they are not return create
sequelize.sync().then(() => {
    console.log("User table create....");
}).catch((err)=>{
    console.log('User table not created...', err);
})


// Rename field
// const changeFieldName = async () =>{
//     try {
//         const query = 'alter table users change column username name varchar(255) not null';
//        const value = await sequelize.query(query);
//         console.log("Field update successfull....");
//     } catch (error) {
//         console.log("Error rename field", error);
//     }finally{
//        await sequelize.close();
//     }
// }
// changeFieldName();


// sync({force: true}) function is used to create the table where table is exist or not 
// sequelize.sync({force: true}).then(() => {
//     console.log("User table create....");
// }).catch((err)=>{
//     console.log('User table not created...', err);
// })


// sequelize.define create model then this model turn into model-class. and 
// it also provide interface to interact with database
// User.create()
// User.findOne()
// User.findAll()
// User.destroy()