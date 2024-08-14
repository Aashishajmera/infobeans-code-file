import bcryptjs from "bcryptjs";
import mongoose from "mongoose";

const userSchema = new mongoose.Schema({
  userName: {
    type: String,
    trim: true,
  },
  email: {
    type: String,
    unique: true,
    required: true,
  },
  password: {
    type: String,
    set: (password) => {
      const saltkey = bcryptjs.genSaltSync(10);
      return bcryptjs.hashSync(password, saltkey);
    },
  },
});

// Create use model 

export const UserModel = mongoose.model("user", userSchema);

UserModel.checkPassword = (password, encryptPass) => {
  return bcryptjs.compare(password, encryptPass);
};
