import {Link, Outlet} from 'react-router-dom'

const Product = ()=>{
    return (
        <>
            <h2>Product...</h2>
            <Link to="newProduct">newProduct</Link>
            <Link to="newTwo" className='ms-3'>newTwo</Link>
            <div>
                <Outlet/>
            </div>
        </>
    )
}

export default Product;