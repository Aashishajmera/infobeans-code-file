import { pool } from "../config/ConnectDb.js";

class Appointment{
    constructor(id, appointmentDate, status, userId, doctorId){
        this.id = id;
        this.appointmentDate = appointmentDate;
        this.status = status;
        this.userId = userId;
        this.doctorId = doctorId;
    }


    // take a appointment
    appointment(){
        return new Promise((resolve, reject)=>{
            pool.getConnection((err, con)=>{
                if(!err){
                    const sql = 'insert into appointment(appointmentDate, status, userId, doctorId) values(?,?,?,?)';
                    con.query(sql, [this.appointmentDate, this.status, this.userId, this.doctorId], (err, result)=>{
                        !err ? resolve(result) : reject(err);
                    })
                    con.release();
                }else{
                    reject(err);
                }
            })
        })
    }

    // appointment history
   static appointmentHistory(userId){
        return new Promise((resolve, reject)=>{
            pool.getConnection((err, con)=>{
                if(!err){
                    const sql = 'select * from appointment where userId = ?';
                    con.query(sql, [userId], (err, result)=>{
                        !err ? resolve(result) : reject(err);
                    })
                    con.release();
                }else{ 
                    reject(err);
                }
            })
        })
    }

    // appointment list
    static appointmentList(){
        return new Promise((resolve, reject)=>{
            pool.getConnection((err, con)=>{
                if(!err){
                    const sql = 'select * from appointment';
                    con.query(sql, (err, result)=>{
                        !err ? resolve(result) : reject(err);
                    })
                    con.release();
                }else{
                    reject(err);
                }
            })
        })
    }

    // manage appointment
    static manageAppointment(statusS, id){
        return new Promise((resolve, reject)=>{
            pool.getConnection((err, con)=>{
                if(!err){
                    const sql = 'update appointment set status = ? where id = ?';
                    con.query(sql, [statusS,id], (err, result)=>{
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

export default Appointment;