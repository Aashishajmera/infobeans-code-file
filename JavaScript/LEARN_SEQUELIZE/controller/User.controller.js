import { validationResult } from "express-validator";
import { User } from "../module/User.module.js";

// add new user
export const addUser = (req, res) => {
  // to check the validation data is ok or not
  const err = validationResult(req); // return err of array[] if validation is ok OTHER validation false err[{}]
  //   console.log(err,"]]]]]]]]]]]]]]]]]]]]");

  //   console.log(!err.isEmpty(),"[[[[[[[[[[[[[[[[[[[[[[[[[[");   false

  // err khali nahi hai matlab error me kuchh hai ==> error hai so
  if (!err.isEmpty()) return res.status(401).json({ err: err.array() });
  // return res.status(401).json({err});

  User.create({
    name: req.body.name,
    email: req.body.email,
    password: req.body.password,
  })
    .then((result) => {
      return res.status(200).json({ message: "user create", result });
    })
    .catch((err) => {
      return res.status(500).json({ err: "some error", err });
    });
};

// view user list
export const userList = (req, res) => {
  User.findAll()
    .then((result) => {
      if (result.length) {
        return res.status(200).json({ userList: result });
      } else {
        return res.status(200).json({ message: "Data not found" });
      }
    })
    .catch((err) => {
      return res.status(500).json({ err });
    });
};

// delete user
export const removeUser = (req, res) => {
  User.destroy({
    where: {
      id: 3,
    },
  })
    .then((result) => {
      if (result > 0) {
        return res
          .status(200)
          .json({ message: "Data successfully delete...", result });
      } else
        return res.status(200).json({ message: "Data not found...", result });
    })
    .catch((err) => {
      return res.status(500).json({ err });
    });
};

// update user
export const updateUser = (req, res) => {
  User.update(
    {
      name: "Aashish",
      email: "aashu@gmail.com",
      password: "9211aashu",
    },
    { where: { id: 2 } }
  )
    .then((result) => {
      if (result.length) {
        return res
          .status(200)
          .json({ message: "data successfull updated...." });
      } else return res.status(200).json({ message: "data not udpated..." });
    })
    .catch((err) => {
      return res.status(500).json({ err });
    });
};

// sign in user
export const signIn = async (req, res) => {
  const email = req.body.email;
  const password = req.body.password;

  const user = await User.findOne({ where: { email } });

  if (user) {
    if (User.checkPassword(password, user.password))
      return res
        .status(200)
        .json({ message: "User successfully sign In", user });
    else return res.status(401).json({ data: "Unauthorized user...", user });
  } else return res.status(400).json({ err });

  //   User.findOne({
  //     where: {
  //       email,
  //     },
  //   })
  //     .then((result) => {
  //       if (result) {
  //         return res
  //           .status(200)
  //           .json({ message: "User successfully get....", result });
  //       } else {
  //         return res.status(200).json({ message: "Data not found...." });
  //       }
  //     })
  //     .catch((err) => {
  //       return res.status(500).json({ err });
  //     });

  
};
