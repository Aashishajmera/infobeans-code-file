import Cart from "../models/Cart.model.js";
import CartItems from "../models/CartItems.model.js";

export const addToCart = async (req, res, next) => {
  try {
    const userId = req.body.userId;
    const productId = req.body.productId;

    let result = await Cart.isCartExist(userId);

    if (result.length) {
      let cartId = result[0].id;
      await CartItems.addToCart(cartId, productId);
      return res
        .status(200)
        .json({ message: "Data successfully inserted", result });
    } else {
      let result = await Cart.createCart(userId);
      let cartId = result[0].id;
      await CartItems.addToCart(cartId, productId);
      return res
        .status(200)
        .json({ message: "Data successfully inserted", result });
    }
  } catch (error) {
    console.log(error);
    return res.status(500).json({ err: "Internal server error" });
  }
};

export const deleteProduct = (req, res) => {
  const id = req.params.id;
  CartItems.deleteProduct(id)
    .then((result) => {
      return res
        .status(200)
        .json({ message: "Data successfully delete", data: result });
    })
    .catch((err) => {
      return res.status(500).json({ error: "Internal server error", err });
    });
};
