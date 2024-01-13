import { pool } from "../ConnectDb/DbConnect.js";

class Admin{

    // create a constructor: 
    constructor(id, username, password){
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // SIGN UP 
    signUp(){
        return new Promise((resolve, reject)=>{
            pool.getConnection((err, con)=>{
                if(err){
                    reject(err);
                }else{
                    const sqlInserQuery = 'insert into admin(username, password) values(?, ?)';
                    con.query(sqlInserQuery, [this.username, this.password], (err, result)=>{
                        if(err){
                            reject(err);
                        }else{
                            resolve(result);
                        }
                    })
                }
            })
        })
    }

    static signIn(){

    }
}

export default Admin;