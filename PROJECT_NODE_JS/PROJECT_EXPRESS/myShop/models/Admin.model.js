import pool from "../connectDb/databaseCon.js";

class Admin {
  constructor(id, username, password) {
    this.id = null;
    this.username = username;
    this.password = password;
  }

  signUp() {
    return new Promise((resolve, reject) => {
      pool.getConnection((err, con) => {
        if (!err) {
          const sql = "insert into admin(username, password) values(?, ?)";
          con.query(sql, [this.username, this.password], (err, result) => {
            // err ? reject(err) : resolve(result);
            if (err) {
              console.log("Data not inserted: " + err);
              reject(err);
            } else {
              console.log("Data successfully inserted: ");
              resolve(result);
            }
            con.release();
          });
        } else {
          console.log("Connection not create: " + err);
          reject(err);
        }
      });
    });
  }

  signIn() {
    return new Promise((resolve, reject) => {
      pool.getConnection((err, con) => {
        if (err) {
          console.log("Connection not create: " + err);
          reject(err);
        } else {
          const sql = "select * from admin where username = ? and password = ?";
          con.query(sql, [this.username, this.password], (err, result) => {
            if (err) {
              console.log("something err when i try to get a data " + err);
              reject(err);
            } else if (result.length != 0) {
              console.log("Data successfully get: ");
              resolve(result);
            } else {
              console.log("database is empty");
              reject(err);
            }
          });
        }
      });
    });
  }
  
}

export default Admin;