import CartItems from "../models/CartItems.model.js";

export const addToCart = (req, res, next)=>{
    // get a cartId and product Id
    const cartId = req.body.cartId;
    const productId = req.body.productId;

    // create a object of cartItems module
    const cartItems = new CartItems(null, cartId, productId);

    cartItems.addToCart().then((result)=>{
        return res.status(200).json({message: 'Data successfully inserted', result});
    }).catch((err)=>{
        return res.status(500).json({err: 'Internal server error'});
    });
}

export const deleteProduct = (req, res)=>{
    const id = req.params.id;
    CartItems.deleteProduct(id).then((result)=>{
        return res.status(200).json({message: 'Data successfully delete', data: result})
    }).catch((err)=>{
        return res.status(500).json({error: 'Internal server error', err})
    })
}