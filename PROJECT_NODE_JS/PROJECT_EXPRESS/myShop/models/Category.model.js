import pool from "../connectDb/databaseCon.js";

class Category {
  constructor(id, categoryName) {
    this.id = id;
    this.categoryName = categoryName;
  }

  addCategory() {
    return new Promise((resolve, rejects) => {
      pool.getConnection((err, con) => {
        if (err) {
          console.log("Connection not create...");
          rejects(err);
        } else {
          const sql = "insert into category(categoryName) values(?)";
          con.query(sql, [this.categoryName], (err, result) => {
            if (err) {
              console.log("Data not inserted....");
              rejects(err);
            } else {
              console.log("Data inserted.....");
              resolve(result);
            }
            con.release();
          });
        }
      });
    });
  }

  static listCategory(){
    return new Promise((resolve, rejects)=>{
        pool.getConnection((err, con)=>{
            if(err){
                console.log("connection time errr");
                rejects(err);
            }else{
                const sql = 'select * from category';
                con.query(sql, (err, result)=>{
                    if(err){
                        console.log("Data get time error"+err);
                        rejects(err);
                    }else{
                        console.log("Data successfully get");
                        resolve(result);
                    }
                    con.release();
                })
            }
        })
    })
  }

  static deleteCategory(id){
    return new Promise((resolve, rejects)=>{
        pool.getConnection((err, con)=>{
            if(err){
                console.log("Connection not stablished....");
                rejects(err);
            }else{
                const sql = 'delete from category where id = ?';
                con.query(sql, [id], (err, result)=>{
                    if(err){
                        console.log("Data not deleted.....");
                        rejects(err);
                    }else{
                      console.log("command successfully done.");
                      resolve(result);
                    }
                    con.release();
                })
            }
        })
    })
  }

  static viewParticular(id){
    return new Promise((resolve, rejects)=>{
        pool.getConnection((err, con)=>{
            if(err){
                console.log("Conenction not stablished.....");
                rejects(err);
            }else{
                const sql = 'select * from category where id = ?';
                con.query(sql, [id], (err, result)=>{
                    if(err){
                        console.log("Data check time errr");
                        rejects(err);
                    }else{
                        console.log("Data successfully view");
                        resolve(result);
                    }
                })
            }
        })
    })
  }
}

export default Category;
