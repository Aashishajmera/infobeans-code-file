import mysql from "mysql2";

export const pool = mysql.createPool({
  user: "root",
  password: "root",
  database: "thegreatayurveda",
  host: "localhost",
  connectionLimit: 100,
});
