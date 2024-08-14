import bodyParser from "body-parser";
import express from "express";
import mongoose from "mongoose";
import cors from 'cors';
import { userRouter } from "./Router/UserRouter.js";

const app = express();

mongoose
  .connect(
    "mongodb+srv://ajmeraaashu55:DwXOaQzBrlS3tP6l@cluster0.yyrl0w1.mongodb.net/InterviewBackend"
  )
  .then(() => {
    app.use(cors())
    app.use(bodyParser.json());
    app.use(bodyParser.urlencoded({ extended: true }));
    app.use("/user", userRouter);
    app.use((req, res, next)=>{
      res.status(404).json({msg: 'page not found'})
    })

    // create server
    app.listen(3000, () => {
      console.log("Server is started.....");
    });
  })
  .catch((err) => {
    console.log("Database connect time error...", err);
  });
