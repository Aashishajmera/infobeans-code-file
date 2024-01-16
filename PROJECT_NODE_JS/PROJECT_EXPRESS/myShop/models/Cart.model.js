import pool from "../connectDb/databaseCon.js";

class Cart{

    // create a constructor
    constructor(id, userId){
        this.id = id;
        this.userId = userId;
    }

    addToCart(){
        return new Promise((resolve, reject)=>{
            pool.getConnection((err, con)=>{
                if(err){
                    console.log("Connection not stablished...");
                    reject(err);
                }else{
                    const sql = 'insert into cart('
                }
            })
        });
    }
}