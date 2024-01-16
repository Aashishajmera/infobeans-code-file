import User from "../models/User.model.js";

export const signUp = (req, res, next) => {
  // get a data into client
  const username = req.body.username;
  const password = req.body.password;
  const contact = req.body.contact;

  // create a object of user model
  const user = new User(null, username, password, contact);

  user.signUp()
    .then((result) => {
      return res.status(201).json({ message: "SignUp successfull....." });
    })
    .catch((err) => {
      return res.status(401).json({ err: "SignUp faild..." });
    });
    // res.end();

};

export const signIn = (req, res, next) => {
  const username = req.body.username;
  const password = req.body.password;

  // create a object of usermodel
  const user = new User(null, username, password);

  user
    .signIn()
    .then((result) => {
      return res.status(201).json({ message: "Sign in successfull..." });
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
