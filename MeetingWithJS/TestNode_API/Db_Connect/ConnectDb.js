import mysql from 'mysql2';

const pool = mysql.createPool({
    user: 'root',
    password: 'root',
    database: 'testapis',
    host: 'localhost',
    connectionLimit: 100
})

export default pool;