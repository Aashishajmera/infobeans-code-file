import pool from "../connectDb/databaseCon.js";

class User {
  constructor(id, username, password, contact) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.contact = contact;
  }

  signUp() {
    return new Promise((resolve, reject) => {
      pool.getConnection((err, con) => {
        if (!err) {
          const sql =
            "insert into user(username, password, contact) values(?, ?, ?)";
          con.query(
            sql,
            [this.username, this.password, this.contact],
            (err, result) => {
              // err ? reject(err) : resolve(result);
              if (err) {
                console.log("Data not inserted: " + err);
                reject(err);
              } else {
                console.log("Data successfully inserted: ");
                resolve(result);
              }
              con.release();
            }
          );
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
          const sql = "select * from user where username = ? and password = ?";
          con.query(sql, [this.username, this.password], (err, result) => {
            if (err) {
              console.log("something err when i try to get a data " + err);
              reject(err);
            } else if (result.length != 0) {
              console.log("Data successfully get: ");
              //   console.log("username: "+result[0].username +" password: "+result[0].password);
              resolve(result);
            } else {
              console.log("database is empty");
              reject(err);
            }
            con.release();
          });
        }
      });
    });
  }

  updateDetails() {
    return new Promise((resolve, rejects) => {
      pool.getConnection((err, con) => {
        if (err) {
          console.log("Connection can't create....");
          rejects(err);
        } else {
          const sql = "update user set username = ? where id = ?";
          con.query(sql, [this.username, this.id], (err, result) => {
            if (err) {
              console.log("Data not updated..");
              rejects(err);
            } else {
              console.log("Data successfully updated....");
              resolve(result);
            }
            con.release();
          });
        }
      });
    });
  }
}

export default User;
