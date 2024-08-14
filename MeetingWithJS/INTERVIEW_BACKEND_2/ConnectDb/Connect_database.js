import { config } from "dotenv";
import mongoose from "mongoose";

config();

export const connectionCreate = mongoose.connect('mongodb+srv://ajmeraaashu55:DwXOaQzBrlS3tP6l@cluster0.yyrl0w1.mongodb.net/demoBackend');

