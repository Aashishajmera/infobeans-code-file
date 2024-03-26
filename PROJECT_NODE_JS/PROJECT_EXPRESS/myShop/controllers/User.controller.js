import User from "../models/User.model.js";
import jwt from "jsonwebtoken";

export const signUp = (req, res, next) => {
  // get a data into client
  const username = req.body.username;
  const password = req.body.password;
  const contact = req.body.contact;

  // create a object of user model
  const user = new User(null, username, password, contact);

  user
    .signUp()
    .then((result) => {
      return res.status(201).json({ message: "SignUp successfull.....lklk" });
    })
    .catch((err) => {
      return res.status(401).json({ err: "SignUp faild..." , err});
    });
  // res.end();
};

export const signIn = (req, res, next) => {
  const username = req.body.username;
  const password = req.body.password;
  // const contact = req.body.contact;

  // create a object of usermodel
  const user = new User();
  user.username = username;
  user.password = password;

  user
    .signIn()
    .then((result) => {
      if (result.length) {
        const payload = { subject: username };
        const token = jwt.sign(payload, "anythingKey");
        return res
          .status(201)
          .json({
            message: "Sign in successfull...",
            data: user,
            result: result[0],
            token: token,
          });
      } else {
        return res.status(200).json({ error: "Unauthorized request" });
      }
    })
    .catch((err) => {
      return res.status(401).json({ err: "Sign in fail...." });
    });
  // res.end();
};

export const updateDetails = (req, res, next) => {
  const username = req.body.username;
  const id = req.body.id;

  // create a object of user module
  const user = new User(id, username);

  user
    .updateDetails()
    .then((result) => {
      return res.status(201).json({ message: "Update successfull....." });
    })
    .catch((err) => {
      return res.status(401).json({ err: "data not updated....." });
    });
  // res.end();
};
