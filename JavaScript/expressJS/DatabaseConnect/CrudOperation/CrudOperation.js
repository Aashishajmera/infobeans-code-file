import pool from "./ConnectDb.js";
import bodyParser from "body-parser";
import express from "express";

// create a object of express
const app = express();

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

app.post("/dataInsert", (req, res, next) => {
  const name = req.body.name;
  const father = req.body.father;
  const category = req.body.category;
  const mobile = req.body.mobile;
  const age = req.body.age;
  const address = req.body.address;
  const skill = req.body.skill;

  // create a connection   INSERT DATA
  pool.getConnection((err, con) => {
    if (!err) {
      const inserQuery =
        "insert into student(Name, Father, categor, Mobile, Age, Address, skill) values(?, ?, ?, ?, ?, ?, ?)";
      con.query(
        inserQuery,
        [name, father, category, mobile, age, address, skill],
        (err, result) => {
          if (!err) {
            res.status(200).json({
              message: "Data send successfully Where data is: ",
              data: { name, father, category, mobile, age, address, skill },
            });
          } else {
            res.status(401).json({ message: "Data not inserted....." });
          }
          con.release();
          res.end();
        }
      );
    } else {
      console.log("Connection not stablished......");
    }
  });
});

// create a connection  DELETE DATA
app.post("/deleteData", (req, res, next) => {
  const id = req.body.id;

  pool.getConnection((err, con) => {
    if (!err) {
      const deleteQuery = "delete from student where id = ?";
      con.query(deleteQuery, id, (err, result) => {
        if (!err) {
          res.status(201).json({ message: "Data successfully deleted...." });
        } else {
          res.status(401).json({ message: "Data not delete" });
          console.log(err);
        }
        con.release();
        res.end();
      });
    } else {
      console.log(err);
    }
  });
});

// create a connection UPDATE DATA
app.post("/updateData",(req, res, next) => {
    const id = req.body.id;

    pool.getConnection((err, con)=>{
        if(!err){
            const updateQuery = 'update student set name = ? where id = ?'
            con.query(updateQuery, ["Rakesh",id], (err, result)=>{
                if(!err){
                    res.status(201).json({message: 'data updated.....'});
                }else{
                    res.status(401).json({message: 'data not update...'});
                }
                con.release();
                res.end();
            })
        }else{
            console.log("Connection faild..."+err);
        }
    })
}); 
// create a server
app.listen(3000, () => {
  console.log("Server started.....");
});
