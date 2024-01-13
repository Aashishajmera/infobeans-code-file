import Admin from '../models/Admin.model.js';


export const signUp = (req, res, next)=>{
    const username = req.body.username;
    const password = req.body.password;

    // create a object of admin model
    const admin = new Admin(null, username, password);

    admin.signUp().then((result)=>{
        return res.status(200).json({message: 'SignUp successfull'});
    }).catch((err)=>{
        return res.status(500).json({err: 'SignUp faild....'});
    });  

}


export const signIn = (req, res, next)=>{

}