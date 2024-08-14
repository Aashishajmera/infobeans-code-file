import UserModule from "../Module/UserModule.js";

// create a middle ware
const signUp = (req, res, next) => {
  const { name, number, email, password } = req.body;
  // create a object of user model
  const user = new UserModule(null, name, number, email, password);

  user
    .signUp()
    .then((result) => {
      return res
        .status(201)
        .json({ message: "Data successfully inserted...", result });
    })
    .catch((err) => {
        console.log(err)
      return res.status(400).json({ message: "error is this..." + err });
    });
};


export const signIn = (req, res, next)=>{
    const {id} = req.body;

    const user = new UserModule(id);

    user.signIn().then((result)=>{
        return res.status(201).json({message: "user successfully log in", result})
    }).catch((err)=>{
        return res.status(401).json({err: "error..."+err})
    });
}


export default signUp;
