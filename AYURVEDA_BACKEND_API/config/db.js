import { Sequelize } from "sequelize";

const sequelize = new Sequelize("testingayurveda","root","root",{
    host:'localhost',
    dialect:'mysql',
    timezone:'+05:30'
})

sequelize.authenticate()
.then(()=>{
    console.log("database connected");
})


.catch(err=>{
    console.log(err)
});
export default sequelize;