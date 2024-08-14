import mysql from 'mysql2';

const connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'root',
    database: 'testdb'
});


connection.connect((err)=>{
    if(!err){
        console.log("Database connected....");
    }else{
        console.log("Error at the time of connect database.....", err);
    }
})