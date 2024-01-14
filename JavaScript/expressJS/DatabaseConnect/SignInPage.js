// import bodyParser from "body-parser";
// import express from "express";
// import pool from "./DbConnect.js";

// const app = express();

// app.use(bodyParser.urlencoded({ extended: true }));
// app.use(bodyParser.json());

// // use middleware always executed....
// app.use((request, response, next) => {
//   console.log("bad request");
//   next();
//   response.end();
// });

// // home page
// app.get("/home", (request, response, next) => {
//   response.write("I am home page.....");
//   response.end();
// });

// app.get("/about", (request, response, next) => {
//   response.write("I am about page....");
//   response.end();
// });

// app.post("/signUp", (request, response, next) => {

//     response.write("I am sign up page")

//   const username = request.body.username;
//   const email = request.body.email;
//   const password = request.body.password;

//   pool.getConnection((err, con) => {
//     if (!err) {
//       const inserDataQuery =
//         "insert into user(username, email, password) values(?, ?, ?)";
//       con.query(inserDataQuery, [username, email, password], (err, result) => {
//         if (err) {
//           return response.status(401).json({ error: "Bad request" });
//         } else {
//           return response
//             .status(200)
//             .json({
//               message: "Signup success",
//               data: { username, email, password },
//             });
//           con.release();
//         }
//       });
//     } else {
//       console.log("Connection Failure...");
//       console.log(err);
//     }
//   });

//   //  response.json({ username, email , password});
//   //   response.end();

// });

// app.get("/contact", (request, response, next) => {
//   response.write("I am contact page....");
//   response.end();
// });

// app.listen(3000, () => {
//   console.log("Server started....");
// });

// ========================================================================================================
import bodyParser from "body-parser";
import express from "express";
import pool from "./DbConnect.js";

const app = express();

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

// use middleware always executed....
// app.use((request, response, next) => {
//   console.log("bad request");
//   next();
//   response.end();
// });

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
//   response.write("I am sign up page");

  const username = request.body.username;
  const email = request.body.email;
  const password = request.body.password;

  pool.getConnection((err, con) => {
    if (!err) {
      const inserDataQuery =
        "insert into user(username, email, password) values(?, ?, ?)";
      con.query(inserDataQuery, [username, email, password], (err, result) => {
        if (err) {
        response.status(401).json({ error: "Bad request" });
        } else {
        response.status(200).json({
            message: "Signup success",
            data: { username, email, password },
          });
          con.release();
        }
      });
    } else {
      console.log("Connection Failure...");
      console.log(err);
    }
  });

  //  response.json({ username, email , password});
  //   response.end();
});

app.get("/contact", (request, response, next) => {
  response.write("I am contact page....");
  response.end();
});

app.listen(3000, () => {
  console.log("Server started....");
});
