import { json, useNavigate } from "react-router-dom";
import { useState } from "react";
import "../App.css";
export default ()=>{
    const navigate = useNavigate();


    const signOut = ()=>{
        sessionStorage.clear();
        navigate("/");
    }



  
    const viewCart=()=>{
      
      navigate("/viewCart",{state:sessionStorage.getItem("user_id")});

    }
    return <>
      <div>
        <header className="header bg-dark text-white">
           <div className="container">
             <div className="row">
                <div className="col-md-3">
                    <img src="logo.png"/>
                    <br/>
                    <small className="text-white">Shopping App</small>
                </div>
                <div className="col-md-6">
                   <div className="search-input"> 
                    <input type="text" placeholder="Search product"/>
                   </div>
                </div>
                <div className="col-md-3">
                    <div className="options">
                        <small onClick={viewCart} style={{cursor:"pointer"}}>View Cart </small>
                        <small onClick={signOut} style={{cursor:"pointer"}}>Sign out</small>
                    </div>
                </div>
             </div>
           </div>
        </header>
      </div>
    </>
}