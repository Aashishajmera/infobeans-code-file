import bcryptjs from "bcryptjs";
import pool from "../Db_Connect/ConnectDb.js";

export default class UserModule {
  constructor(id, name, number, email, password) {
    this.id = id;
    this.name = name;
    this.number = number;
    this.email = email;
    this.password = password;
  }
  setPassword(password) {
    const saltkey = bcryptjs.genSalt(10);
    const encryptedPass = bcryptjs.hashSync(saltkey, password);
  }

  signUp() {
    return new Promise((resolve, reject) => {
      pool.getConnection((err, con) => {
        if (!err) {
          const sql =
            "insert into user(name, number, email, password) values(?, ?, ?, ?)";
          con.query(
            sql,
            [this.name, this.number, this.email, this.password],
            (err, result) => {
              if (err) {
                console.log(err);
                reject(err);
              } else {
                console.log("Data successfully inserted....");
                resolve(result);
              }
              con.release();
            }
          );
        } else {
          console.log("Connection not connect....");
          reject(err);
        }
      });
    });
  }

  signIn() {
    return new Promise((resolve, reject) => {
      pool.getConnection((err, con) => {
        if (!err) {
          const sql = "select * from user where id = ?";
          con.query(sql, [this.id], (err, result) => {
            if (err) {
              console.log("Data get time err....");
              reject(err);
            } else {
              console.log("data successfully find");
              resolve(result);
            }
          });
        }
      });
    });
  }

  update() {}
}
