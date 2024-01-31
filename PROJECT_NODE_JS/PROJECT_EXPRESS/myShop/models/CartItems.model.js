import pool from "../connectDb/databaseCon.js";
class CartItems{
    constructor(id, cartId, productId){
        this.id = id;
        this.cartId = cartId;
        this.productId = productId;
    }

  static  addToCart(cartId, productId){
        return new Promise((resolve, reject)=>{
            pool.getConnection((err, con)=>{
                if(err){
                    console.log("Connection time error", err);
                    reject(err);
                }else{
                    const sql = 'insert into cartItems(cartId, productId) values(?, ?)';
                    con.query(sql, [cartId, productId], (err, result)=>{
                        con.release();
                        if(err){
                            console.log("Data insert time error", err);
                            reject(err);
                        }else{
                            console.log("Data successfully insert the data is: ", result);
                            resolve(result);
                        }
                    })
                }
            })
        })
    }

   static deleteProduct(id){
        return new Promise((resolve, reject)=>{
            pool.getConnection((err, con)=>{
                if(err){
                    console.log("Connection time error", err);
                    reject(err);
                }else{
                    const sql = 'delete from cartItems where id = ?'
                    con.query(sql, [id], (err, result)=>{
                        if(err){
                            console.log("Data insert time errod",err);
                            reject(err);
                        }else{
                            resolve(result);
                        }
                    })
                }
            })
        })
    }
}

export default CartItems;