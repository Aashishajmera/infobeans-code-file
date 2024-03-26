import axios from "axios";
import { useState, useEffect } from "react";
import { ToastContainer, toast } from "react-toastify";
import { useNavigate } from "react-router-dom";

export default (props) => {
  const navigate = useNavigate();
  const [cartItems, setCartItems] = useState([]);

  useEffect(() => {
    // Fetch cart items when component mounts
    fetchCartItems();
  }, []);

  const fetchCartItems = () => {
    axios.get(" ", {
      params: { userId: sessionStorage.getItem("user-id") },
    })
      .then((response) => {
        setCartItems(response.data.cartItems);
      })
      .catch((err) => {
        toast.error("Failed to fetch cart items");
      });
  };

  const removeFromCart = (productId) => {
    axios.delete("http://localhost:3000/cart/removeFromCart", {
      data: { userId: sessionStorage.getItem("user-id"), productId },
    })
      .then((response) => {
        toast.success(response.data.message);
        fetchCartItems(); // Refresh cart items after removal
      })
      .catch((err) => {
        toast.error("Failed to remove item from cart");
      });
  };

  return (
    <>
      <ToastContainer />
      <div className="container mt-3">
        <h2>Cart Items</h2>
        <table className="table">
          <thead>
            <tr>
              <th>Title</th>
              <th>Price (Rs.)</th>
              <th>Quantity</th>
              <th>Action</th>
            </tr>
          </thead>
          <tbody>
            {cartItems.map((item, index) => (
              <tr key={index}>
                <td>{item.title}</td>
                <td>{item.price}</td>
                <td>{item.quantity}</td>
                <td>
                  <button
                    onClick={() => removeFromCart(item.productId)}
                    className="btn btn-danger"
                  >
                    Remove
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </>
  );
};
