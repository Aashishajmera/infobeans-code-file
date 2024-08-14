import { validationResult } from "express-validator";
import { itemModel } from "../Model/ItemModel.js";

// ADD ITEMS
export const addItem = (req, res) => {
    const errors = validationResult(req);
    const { title, description } = req.body;
    
    if (!errors.isEmpty()) 
        return res.status(401).json({ error: errors.array() });
    
    // add item
    itemModel.create({ title, description })
        .then((result) => {
           if(result)
            return res.status(201).json({ msg: 'Items successfully inserted', result });
        })
        .catch((err) => {
            return res.status(501).json({ msg: 'Data insertion error', err });
        });
}

// GET ALL ITEMS
export const getItems = (req, res) => {
    itemModel.find()
        .then((result) => {
           if(result.length === 0){
            return res.status(404).json({msg: 'Item not found'});
           }
            return res.status(201).json({ msg: 'Items successfully found', result });
        })
        .catch((err) => {
            return res.status(501).json({ msg: 'Data find time error', err });
        });
}

// GET ONE ITEM
export const getOneItem = (req, res) => {
    const {_id} = req.body;
    itemModel.findById({_id})
    .then((result) => {
        if(result.length === 0){
         return res.status(404).json({msg: 'Item not found'});
        }
         return res.status(201).json({ msg: 'Items successfully found', result });
     })
     .catch((err) => {
         return res.status(501).json({ msg: 'Data find time error', err });
     });
}

// UPDATE ITEMS
export const updateItem = (req, res) => {
    const {_id, title, description} = req.body;
    itemModel.updateOne({_id}, {$set: {title, description}})
        .then((result) => {
            if (result.modifiedCount === 0) {
                return res.status(404).json({ msg: 'Items not update', result });
            }
            return res.status(201).json({ msg: 'Items successfully update', result });
        })
        .catch((err) => {
            return res.status(501).json({ msg: 'Data update time error', err });
        });
}

// DELETE ITEMS
export const deleteItem = (req, res) => {
    const {_id} = req.body;
    itemModel.deleteOne({_id})
        .then((result) => {
            if (result.deletedCount === 0) {
                return res.status(404).json({ msg: 'Items not found', result });
            }
            return res.status(201).json({ msg: 'Items successfully delete', result });
        })
        .catch((err) => {
            return res.status(501).json({ msg: 'Data delete time error', err });
        });
}