import { pool } from "../config/ConnectDb.js";

export default class DoctorDetails{
    constructor(id, qualificationImage, experience, gender, language, clinicAddress, imageUrl, specialization, doctorId){
        this.id = id;
        this.qualificationImage = qualificationImage;
        this.experience = experience;
        this.gender = gender;
        this.language = language;
        this.clinicAddress = clinicAddress;
        this.imageUrl = imageUrl;
        this.specialization = specialization;
        this.doctorId = doctorId;
    }


    verifyDoctor(){  
        return new Promise((resolve, reject)=>{
            pool.getConnection((err, con)=>{
                if(!err){
                    const sql = 'insert into doctordetails(qualificationImage, experience, gender, language, clinicAddress, imageUrl, specialization, doctorId) values(?,?,?,?,?,?,?,?)';

                    con.query(sql, [this.qualificationImage, this.experience, this.gender, this.language, this.clinicAddress, this.imageUrl, this.specialization, this.doctorId], (err, result)=>{
                        !err ? resolve(result) : reject(err);
                    });
                    
                    con.release();                  
                }else{
                    reject(err);
                }
            })
        })
    }
}