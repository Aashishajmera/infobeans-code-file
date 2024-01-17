import pool from "../connectDb/databaseCon.js";

export default class Cart{

    // create a constructor
    constructor(id, userId){
        this.id = id;
        this.userId = userId;
    }

    createCart(){
        return new Promise((resolve, reject)=>{
            pool.getConnection((err, con)=>{
                if(err){
                    console.log("Connection not established...");
                    reject(err);
                }else{
                    const sql = 'insert into cart(userId) values(?)';
                    con.query(sql, [this.userId], (err, result)=>{
                        if(err){
                            console.log("Data insert time error: "+err);
                            reject(err);
                        }else{
                            resolve(result);
                        }
                    })
                }
            })
        });
    }

}

