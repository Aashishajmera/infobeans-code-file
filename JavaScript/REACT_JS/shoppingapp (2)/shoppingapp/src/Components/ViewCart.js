import axios from "axios"
import { useEffect, useState } from "react"
import { useLocation } from "react-router-dom"

export default () => {
  const [cartitems,setCartItems]=useState([]);
  const state=useLocation();
  // console.log(state);
  const userId=state.state;
  console.log(userId);
  const cartUrl=`http://localhost:3000/cart/viewAllCarts/${userId}`;
  useEffect(()=>{
    axios.get(cartUrl)
    .then(response=>{
      // setCartItems(response.data);
      setCartItems(response.data.result);

    }).catch(err=>{
      console.log("Something went wrong");
    })
  },[])


    
    return <>
          <div className="container-fulid ">
        <h3 className="bg bg-info text-center ">Product List</h3>
        <table className="table">
            <thead>
            <tr>
                    <th>S.no</th>
                    <th>Title</th>
                    <th>Quantity</th>
                    <th>Price</th>  
                    <th>Total</th>
                    <th>Delete</th>
            </tr>

            </thead>
            <tbody>
              {cartitems.map((product,index)=><tr key={index}>       
                <td>{index+1}</td>
                <td>{product.title}</td>
                <td>{product.brand}</td>
                <td>{product.price}</td>
                <td><button className="bg bg-danger">Delete</button></td>
                <td><button className="bg bg-info">Edit</button></td>
                </tr> )}  
            </tbody>
        </table>
     </div>

    </>
}