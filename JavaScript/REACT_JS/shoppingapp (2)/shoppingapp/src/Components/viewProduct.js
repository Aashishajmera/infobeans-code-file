import { useState } from "react";
import "./ViewProduct.css"
import Header from "./Header";

import { useLocation } from "react-router-dom"

export default () => {
    const { state } = useLocation();
    const images = state.images.split("undefined")[1].split(",");
    const [pImage, setImage] = useState(state.thumbnail)
    const setThumbnail = (image) => {
        setImage(image)
    }
    function magnify(myimage, zoom) {
        var img, glass, w, h, bw;
        img = document.getElementById("myimage");

        /* Create magnifier glass: */
        glass = document.createElement("DIV");
        glass.setAttribute("class", "img-magnifier-glass");

        /* Insert magnifier glass: */
        img.parentElement.insertBefore(glass, img);

        /* Set background properties for the magnifier glass: */
        glass.style.backgroundImage = "url('" + img.src + "')";
        glass.style.backgroundRepeat = "no-repeat";
        glass.style.backgroundSize = (img.width * zoom) + "px " + (img.height * zoom) + "px";
        bw = 3;
        w = glass.offsetWidth / 2;
        h = glass.offsetHeight / 2;

        /* Execute a function when someone moves the magnifier glass over the image: */
        glass.addEventListener("mousemove", moveMagnifier);
        img.addEventListener("mousemove", moveMagnifier);

        /*and also for touch screens:*/
        glass.addEventListener("touchmove", moveMagnifier);
        img.addEventListener("touchmove", moveMagnifier);
        function moveMagnifier(e) {
            var pos, x, y;
            /* Prevent any other actions that may occur when moving over the image */
            e.preventDefault();
            /* Get the cursor's x and y positions: */
            pos = getCursorPos(e);
            x = pos.x;
            y = pos.y;
            /* Prevent the magnifier glass from being positioned outside the image: */
            if (x > img.width - (w / zoom)) { x = img.width - (w / zoom); }
            if (x < w / zoom) { x = w / zoom; }
            if (y > img.height - (h / zoom)) { y = img.height - (h / zoom); }
            if (y < h / zoom) { y = h / zoom; }
            /* Set the position of the magnifier glass: */
            glass.style.left = (x - w) + "px";
            glass.style.top = (y - h) + "px";
            /* Display what the magnifier glass "sees": */
            glass.style.backgroundPosition = "-" + ((x * zoom) - w + bw) + "px -" + ((y * zoom) - h + bw) + "px";
        }

        function getCursorPos(e) {
            var a, x = 0, y = 0;
            e = e || window.event;
            /* Get the x and y positions of the image: */
            a = img.getBoundingClientRect();
            /* Calculate the cursor's x and y coordinates, relative to the image: */
            x = e.pageX - a.left;
            y = e.pageY - a.top;
            /* Consider any page scrolling: */
            x = x - window.pageXOffset;
            y = y - window.pageYOffset;
            return { x: x, y: y };
        }
    }


    return <>
        <Header />
        <div className=" product-detail-box">
            <div className="product-detail-image ">
                <img src={pImage} alt="" id="myimage" onClick={() => { magnify("myimage", 3) }} />

                <div className="images">
                    {images.map((image, index) => <div className="inner-images" key={index}>
                        <img onClick={() => setThumbnail(image)} src={image} alt="" />
                    </div>)}
                </div>
            </div>
            <div className="product-detail-content">
                <h3>{state.title}</h3>
                <h3>Brand : {state.brand}</h3>
                <h3>{state.price}₹</h3>
                <small>{state.description}</small>
                <small>Rating : {state.rating}</small>
                <button className="btn btn-success" style={{ width: "200px" }}>Add To Cart</button>
            </div>
        </div>
    </>
}