import Admin from "../models/Admin.model.js";

// SIGN UP PAGE 
export const signUp = (req, res, next) => {
  const username = req.body.username;
  const password = req.body.password;

  // create a object of admin class
  const admin = new Admin(null, username, password);

  admin
    .signUp()
    .then((result) => {
      return res.status(201).json({ message: "Sign up successfully......" });
    })
    .catch((err) => {
      return res.status(401).json({ error: "Sign up fail....." });
    });
    // res.end();

};


// SIGN IN PAGE
export const signIn = (req, res, next) => {
  // const username = req.body.username;
  // const password = req.body.password;
const {username,password}=req.body
  const admin = new Admin(null, username, password);

  admin.signIn().then((result)=>{
    return res.status(201).json({message: 'Sign in successfully.....'})
  }).catch((err)=>{
    return res.status(401).json({err: 'Sign in fail....'})
  });
  // res.end();

};
