import bodyParser from "body-parser";
import dotenv from 'dotenv';
import express from "express";
import { connection } from "./Db/DbConfig.js";
import { userRouter } from "./Router/UserRouter.js";

// create app level middleware
dotenv.config();
const app = express();


connection
  .then(() => {
    console.log("Database successfully created...");

    app.use(bodyParser.json())
    app.use(bodyParser.urlencoded({extended: true}))

    app.use('/user', userRouter);

    app.use((err, req, res, next)=>{
        return res.status(404).json({msg: 'Page not found...', err})
    })

    app.listen(process.env.PORT || 3000, () => {
      console.log("server started...");
    });
    
  })
  .catch((err) => {
    console.log("database connect time error", err);
  });
