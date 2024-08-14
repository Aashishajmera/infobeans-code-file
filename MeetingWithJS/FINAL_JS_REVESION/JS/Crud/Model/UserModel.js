import mongoose from "mongoose";
import bcryptjs from 'bcryptjs';

const userSchema = new mongoose.Schema({
  name: {
    type: String,
    trim: true,
  },
  email: {
    type: String,
    required: true,
    unique: true,
  },
  password: {
    type: String,
    set: (password) =>{
        const payload = bcryptjs.genSaltSync(10);
        return bcryptjs.hashSync(password, payload);
    }
  }
});

export const userModel = mongoose.model('user', userSchema);

userModel.checkPassword = (password, encryptpass) =>{
    return bcryptjs.compareSync(password, encryptpass);
}
