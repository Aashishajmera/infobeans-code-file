import Cart from "../models/Cart.model.js";


export const createCart = (req, res)=>{
    // get a userId 
    const userId = req.body.userId;

    // create a object of cart module
    const cart = new Cart(null, userId);

    cart.createCart().then((result)=>{
        return res.status(200).json({message: 'User id added successfully'})
    }).catch((err)=>{
        return res.status(500).json({err: 'Internal server error'})
    });
}