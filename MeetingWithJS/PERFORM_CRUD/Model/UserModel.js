import mongoose from 'mongoose';
import bcryptjs from 'bcryptjs';

const userSchema = new mongoose.Schema({
    userName: {
        type: String,
        required: true
    }, imageUrl: {
        type: String,
        required: true
    }, password: {
        type: String,
        set: (password) => {
            const saltkey = bcryptjs.genSaltSync(10);
            return bcryptjs.hashSync(password, saltkey);
        }
    }
})

// create a module
export const userModule  = mongoose.model('user', userSchema);

userModule.checkPassword = (password, encryptPass) => {
    return bcryptjs.compareSync(password, encryptPass);
}