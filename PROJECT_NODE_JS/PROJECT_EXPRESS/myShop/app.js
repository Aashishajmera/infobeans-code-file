import bodyParser from "body-parser";
import express from "express";
import path from "path";
import { fileURLToPath } from "url";
import AdminRouter from "./routers/Admin.router.js";
import CartRouter from "./routers/Cart.router.js";
import CategoryRouter from "./routers/Category.router.js";
import ProductRouter from "./routers/Product.router.js";
import UserRouter from "./routers/User.router.js";

// create a object of express
const app = express();

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

// get a full file path
const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);

// get a imagefile path
app.use(express.static(path.join(__dirname, "public")));

// to call the admin router
app.use("/admin", AdminRouter);

// to call the user router
app.use("/user", UserRouter);

// to call the category router
app.use("/category", CategoryRouter);

// to call the product router
app.use("/product", ProductRouter);

// to call the cart router
app.use("/cart", CartRouter);

// create a server
app.listen(3000, () => {
  console.log("Server called.....");
});