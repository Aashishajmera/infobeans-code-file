import bodyParser from "body-parser";
import express from "express";

const app = express();

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

// use middleware always executed....
app.use((request, response, next) => {
  console.log("bad request");
  next();
  response.end();
});

// home page
app.get("/home", (request, response, next) => {
  response.write("I am home page.....");
  response.end();
});

app.get("/about", (request, response, next) => {
  response.write("I am about page....");
  response.end();
});

app.post("/signUp", (request, response, next) => {
  const username = request.body.username;
  const email = request.body.email;
  const password = request.body.password;
 response.json({ username, email , password});
  response.end();
});

app.get("/contact", (request, response, next) => {
  response.write("I am contact page....");
  response.end();
});

app.listen(3000, () => {
  console.log("Server started....");
});
