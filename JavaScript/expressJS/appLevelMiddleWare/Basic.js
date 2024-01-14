import express, { response } from "express";

// create a object of expession
const app = express();

app.get("/", (request, response, next) => {
  response.write("Home page....");
  response.end();
});

app.get("/about", (request, response, next) => {
  response.write("I am about page.....");
  response.end();
});

app.get("/contact", (request, response, next) => {
  response.write("I am contact page.....");
  response.end();
});

app.use((request, response, next) => {
  response.write("bad request.....");
  response.end();
});

// create a server
app.listen(3000, () => {
  console.log("Server started.....");
});
