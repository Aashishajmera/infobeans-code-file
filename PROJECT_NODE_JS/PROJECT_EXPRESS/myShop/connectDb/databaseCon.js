import mysql from 'mysql2';

const pool = mysql.createPool({
    user: "root",
    password: "root",
    database: "myshop",
    host: "localhost",
    connectionLimit: 100
});

export default pool;