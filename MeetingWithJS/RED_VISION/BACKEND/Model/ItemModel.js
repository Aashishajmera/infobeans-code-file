import mongoose  from "mongoose";

const itemSchema = new mongoose.Schema({
    title: {
        type: String,
        trim: true,
        required: true,
        unique: true
    }, description: {
        type: String,
        required: true
    }
});


export const itemModel = mongoose.model('Item', itemSchema);