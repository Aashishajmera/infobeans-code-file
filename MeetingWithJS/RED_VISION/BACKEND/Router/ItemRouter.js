import dotenv from 'dotenv';
import express from "express";
import { body } from "express-validator";
import { addItem, deleteItem, getItems, getOneItem, updateItem } from "../Controller/ItemController.js";
dotenv.config();

export const itemRouter = express.Router();


// API FOR ADD ITEMS
itemRouter.post(
  process.env.ADD_ITEMS,
  body("title", "title is required").notEmpty(),
  body("description", "description is required").notEmpty(),
  addItem
);


// API FOR GET ALL ITEMS
itemRouter.get(process.env.GET_ITEMS, getItems);


// API FOR GET ONE ITEMS
itemRouter.get(process.env.GET_ONE_ITEM, getOneItem);

// API FOR UPDATE 
itemRouter.put(process.env.UPDATE_ITEM, updateItem);

// API FOR DELETE 
itemRouter.delete(process.env.DELETE_ITEM, deleteItem);