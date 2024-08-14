import bodyParser from "body-parser";
import express from "express";
import mongoose from "mongoose";
import { userRouter } from "./Router/UserRouter.js";

const app = express();

// mongodb+srv://<username>:<password>@cluster0.e1inkbc.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0

mongoose
  .connect(
    "mongodb+srv://ajmeraaashu55:DwXOaQzBrlS3tP6l@cluster0.yyrl0w1.mongodb.net/aashish"
  )
  .then(() => {
    app.use(bodyParser.json());
    app.use(bodyParser.urlencoded({ extended: true }));
    app.use("/User", userRouter);
  })
  .catch((err) => {
    console.log("Data base connect time error...." + err);
  });

app.listen(3000, () => {
  console.log("Server started....");
});
