import { pool } from "../config/ConnectDb.js";

export default class DoctorFeedback{
    constructor(id, ratingStar, reviewText, userId, doctorId){
        this.id = id; 
        this.ratingStar = ratingStar;
        this.reviewText = reviewText;
        this.userId = userId;
        this.doctorId = doctorId;
    }

      // Doctor feedback
      doctorFeedback(){
        return new Promise((resolve, reject)=>{
            pool.getConnection((err, con)=>{
                if(!err){
                     const sql = 'insert into doctorfeedback(ratingStar, reviewText, userId, doctorId) values(?,?,?,?)';
                     con.query(sql, [this.ratingStar, this.reviewText, this.userId, this.doctorId], (err, result)=>{
                        !err ? resolve(result) : reject(err);
                     })
                     con.release();
                }else{
                    reject(err);
                }
            })
        })
    }
}