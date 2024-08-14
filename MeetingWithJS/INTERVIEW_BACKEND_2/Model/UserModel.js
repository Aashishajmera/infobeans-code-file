import mongoose from "mongoose";
import bcryptjs from "bcryptjs";
const userSchema = new mongoose.Schema({
  name: {
    type: String,
    trim: true,
    required: true,
  },
  email: {
    type: String,
    trim: true,
    unique: true,
  },
  password: {
    type: String,
    required: true,
    set: (password) => {
      const saltkey = bcryptjs.genSaltSync(10);
      return bcryptjs.hashSync(password, saltkey);
    },
  },
});

// create a user table
export const userModel = mongoose.model("user", userSchema);

userModel.checkPassword = (password, encryptPass) => {
  return bcryptjs.compare(password, encryptPass);
};
