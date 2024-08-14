import userModule from "../Model/UserSchema.js";

// export const signUp = (req, res, next) => {
//   userModule
//     .create(req.body)
//     .then((result) => {
//       return res
//         .status(201)
//         .json({ message: "SignUp sccessfull....." + result });
//     })
//     .catch((err) => {
//         console.log(err);
//       return res
//         .status(401)
//         .json({ message: "Internal server error...." + err });
//     });
// };

export const signUp = async (req, res, next) => {
  try {
    const user = await userModule.create(req.body);
    if (!user) {
      res.status(401).json({ message: "error" });
    }
    res.status(201).json({ message: "user successfully login" });
  } catch (err) {
    res.status(500).json({ message: "error" });
  }
};

export const signIn = async (req, res, next) => {
  try {
    const { email, password } = req.body;

    const user = await userModule.findOne({ email });

    if (!user) {
      return res.status(400).json({ message: "User not found", user });
    } else if (user) {
      if (userModule.checkPassword(password, user.password)) {
        return res
          .status(200)
          .json({ message: "User Sign In successfully.....", user });
      }
    }
  } catch (error) {
    console.log(error);
    return res.status(401).json({ message: "Internal server error", error });
  }
};

// export const update = async (req, res, next) => {
//   try {
//     const { _id, name } = req.body;

//     const user = await userModule.findByIdAndUpdate(_id, name, {
//       new: true,
//     });

//     console.log(user);

//     if (!user) {
//       return res.status(404).json({ message: "user not found" });
//     }
//     if (user) {
//       return res
//         .status(201)
//         .json({ message: "user successfully update...", user });
//     }
//   } catch (err) {
//     console.log(err);
//     return res.status(501).json({ message: "Internal server error", err });
//   }
// };

export const update = (req, res, next) => {
  const { _id, name, email } = req.body;
  console.log("name: ", name);
  console.log("email: ", email);
  // Destructure _id and updateData from req.body

  userModule
    .findByIdAndUpdate(_id, { name, email }) // Update with new data
    .then((user) => {
      if (!user) {
        return res.status(404).json({ msg: "User not found" });
      }
      return res.status(200).json({ msg: "Update successfully", user });
    })
    .catch((err) => {
      console.error(err);
      return res.status(500).json({ msg: "Internal server error" });
    });
};
