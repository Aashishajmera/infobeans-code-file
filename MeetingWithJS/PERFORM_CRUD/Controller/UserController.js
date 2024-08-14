import { userModule } from "../Model/UserModel.js";

// export const signUp = async (req, res, next) => {
//     console.log("i am controller");
//   const { userName, imageUrl, password } = req.body;
//   try {
//     const user = await userModule.create({ userName, imageUrl, password });
//     if (!user) {
//       return res.status(404).json({ msg: "Data is not inserted.....", user });
//     }
//     return res
//       .status(201)
//       .json({ msg: "Data successfully inserted....", user });
//   } catch (error) {
//     return res.status(501).json({ msg: "internal server error", error });
//   }
// };


export const signUp = (req, res, next)=>{
    console.log('i m controller');
    userModule.create(req.body).then((result)=>{
        if(!result){
            return res.status(404).json({msg: 'not singup...', result})
        }
        return res.status(201).json({msg: 'user sign in successfully....', result})
    }).catch(err=>{
        return res.status(501).json({msg: 'Internal server error', err})
    })
}