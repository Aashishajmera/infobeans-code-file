import bcryptjs from "bcryptjs";
import mongoose from "mongoose";

const UserSchema = new mongoose.Schema({
  name: {
    type: String,
  },
  email: {
    type: String,
    unique: true,                  
  },
  password: {
    type: String,
    trim: true,
    set: (password) => {
      const saltkey = bcryptjs.genSaltSync(10);
      return bcryptjs.hashSync(password, saltkey);
    },
  },
});

const userModule = mongoose.model("user", UserSchema);

// encrypt password
userModule.checkPassword = (password, encryptPass) => {
  return bcryptjs.compareSync(password, encryptPass);
};

export default userModule;
