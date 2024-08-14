import { userModel } from "../Model/UserModel.js";
import jwt from 'jsonwebtoken';

export const signUp = (req, res, next) =>{
    console.log(req.body);
    userModel.create(req.body).then((result)=>{
        if(!result)
            return res.status(501).json({msg: 'user insert time error', result})
        return res.status(201).json({msg: 'user SignUp successfull...', result})
    }).catch(err=>{
        return res.status(501).json({msg: 'internal server error', err})
    })
}

export const allUser = (req, res, next) => {
    console.log('controller....');
    userModel.find().then((result)=>{
        if(!result)
            return res.status(404).json({msg: 'Data not found...'});
        return res.status(201).json({msg: 'data successfully found...', result})
    }).catch(err=>{
        return res.status(501).json({msg: 'Internal server error...', err})
    })
}

export const signIn = (req, res, next) =>{
    const {email, password} = req.body;

    const payload = email;
    const token = jwt.sign(payload, 'aashishtoken');
    console.log(token);

    userModel.findOne({email}).then((user)=>{
        if(user){
            if(userModel.checkPassword(password, user.password)){
                return res.status(201).json({msg: 'user successfully signIN', user})
            }else{
                return res.status(401).json({msg: 'password wrong', user})
            }
        }
    }).catch(err=>{
        return res.status(501).json({msg: 'internal server error', err})
    })
}