import { pool } from "../config/ConnectDb.js";

class Doctor {

  
  constructor(
    id,
    doctorName,
    email,
    password,
    contactNumber,
    registrationNumber
  ) {
    this.id = id;
    this.doctorName = doctorName;
    this.email = email;
    this.password = password;
    this.contactNumber = contactNumber;
    this.registrationNumber = registrationNumber;
  }

  // Doctor signUp
  signUp() {
    return new Promise((resolve, reject) => {
      pool.getConnection((err, con) => {
        if (!err) {
          const sql =
            "insert into doctor(doctorName, email, password, contactNumber, registrationNumber) values(?,?,?,?,?)";
          con.query(
            sql,
            [
              this.doctorName,
              this.email,
              this.password,
              this.contactNumber,
              this.registrationNumber,
            ],
            (err, result) => {
              !err ? resolve(result) : reject(err);
            }
          );
          con.release();
        } else {
          reject(err);
        }
      });
    });
  }

  // Doctor signIn
  signIn() {
    return new Promise((resolve, reject) => {
      pool.getConnection((err, con) => {
        if (!err) {
          const sql = "select * from doctor where email = ? and password = ?";
          con.query(sql, [this.email, this.password], (err, result) => {
            !err ? resolve(result) : reject(err);
          });
          con.release();
        } else {
          reject(err);
        }
      });
    });
  }

  // Doctor list
  static doctorList() {
    return new Promise((resolve, reject) => {
      pool.getConnection((err, con) => {
        if (!err) {
          const sql = "select * from doctor";
          con.query(sql, (err, result) => {
            !err ? resolve(result) : reject(err);
          });
          con.release();
        } else {
          reject(err);
        }
      });
    });
  }

}

export default Doctor;