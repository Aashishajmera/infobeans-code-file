import jwt from 'jsonwebtoken';
import { userModel } from "../Model/UserModel.js";

export const singUp = (req, res, next) => {
  console.log(req.body);
  userModel
    .create(req.body)
    .then((result) => {
      return res
        .status(201)
        .json({ msg: "User signup successfully...", result });
    })
    .catch((err) => {
      return res.status(501).json({ msg: "Internal server error", err });
    });
};

export const signIn = async (req, res, next) => {
  try {
    const { email, password } = req.body;
    const payload = email;
    const token = jwt.sign(payload, 'aashishtoken');
    console.log(token);
    const user = await userModel.findOne({email});

    if(!user){
        return res.status(401).json({msg: 'user not found'})
    }
    if(userModel.checkPassword(password, user.password)){
        return res.status(200).json({msg: 'user sign in successfully....'});
    }

  } catch (error) {
    console.log(error);
    return res.status(501).json({ msg: "Internal server error", error });
  }
};

export const update = async (req, res, next) => {
    
    const userUpdate = await userModel.updateOne();
}