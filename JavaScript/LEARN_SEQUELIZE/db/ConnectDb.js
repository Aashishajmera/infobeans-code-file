import { Sequelize } from "sequelize";


// to connect the database
export const sequelize = new Sequelize("testsequelizedb", 'root', 'root', {
    host: 'localhost',
    dialect: 'mysql'
});

// to check the connection of database
sequelize.authenticate().then(()=>{
    console.log("Database connected...");
}).catch((err)=>{
    console.log("Database connection failed...", err);
})