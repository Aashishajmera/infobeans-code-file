import jwt from "jsonwebtoken";
import { UserModel } from "../Module/UserModule.js";

export const signUp = (req, res, next) => {
  console.log(req.body)
  UserModel.create(req.body)
    .then((result) => {
      if (!result) {
        return res.status(404).json({ msg: "something went wrong...", result });
      }
      return res
        .status(201)
        .json({ msg: "User signUp successfull...", result });
    })
    .catch((err) => {
      console.log(err);
      return res.status(500).json({ msg: "Internal server error...", err });
    });
};

export const signIn = (req, res, next) => {
  const { email } = req.body;

  const payload = { email };
  const token = jwt.sign(payload, "aashishtoken");
  UserModel.findOne({ email })
    .then((result) => {
      return res
        .status(201)
        .json({ msg: "User signIn successfully...", result, token });
    })
    .catch((err) => {
      return res.status(500).json({ msg: "Internal server error", err });
    });
};

export const getAllUser = (req, res, next) => {
  UserModel.find().then((result)=>{
    if(!result)
      return res.status(404).json({msg: 'user not found', result})
    return res.status(201).json({msg: 'user successfully get', result})
  }).catch(err=>{
    return res.status(501).json({msg: 'Internal server error', err})
  })
}

export const deleteUser = async (req, res, next) => {
  console.log("Hello");
  const { email } = req.body;
  const deleteUser = await UserModel.deleteOne({ email });
  console.log(deleteUser);
  if (deleteUser.acknowledged) {
    return res
      .status(201)
      .json({ msg: "User successfully delete...", deleteUser });
  }
  return res.status(401).json({ msg: "data not delete" });
};

export const updateUser = async (req, res, next) => {
  console.log(req.body)
  try {
    const { userName, email,password } = req.body;

    const updateUser = await UserModel.updateMany(
      { email },
      { $set: { userName,password,email } }
    );

    if (updateUser.matchedCount == 0) {
      return res.status(404).json({ msg: "User not found...." });
    } else if (updateUser.modifiedCount != 0) {
      return res
        .status(201)
        .json({ msg: "user successfully updated....", updateUser });
    }
  } catch (err) {
    console.log(err)
    return res.status(500).json({ message: "Internal server error", err });
  }
};
