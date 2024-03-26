import axios from "axios";
import { useEffect, useState } from "react"

export default ({setProductList})=>{
    const [categoryList,setCategoryList] = useState([]);
    useEffect(()=>{
        axios.get("http://localhost:3000/category/viewcategory")
        .then(response=>{
            setCategoryList(response.data.result)
        }).catch(err=>{
            console.log(err);
        })
    },[]);

    const getProductByCategory = (categoryName)=>{
        axios.get(`http://localhost:3000/product/viewAll/${categoryName}`)
        .then(response=>{
            setProductList(response.data.category.products);
            
        }).catch(err=>{
            console.log(err);
        })
    }
    return <>
      <div className="container mt-3">
       
       <div className="container-fluid">
        <div className="row">
           {categoryList.map((category,index)=><div key={index} className="col-md-2">
              <div onClick={()=>getProductByCategory(category.categoryName)} className="d-flex justify-content-center align-items-center" style={{fontSize: '12px',height:"50px", margin:"10px", boxShadow: "5px 5px 5px grey"}}>{category.categoryName.toUpperCase()}</div>
           </div>)}  
        </div>
       </div>
       <hr/>
      </div>      
    </>
}
