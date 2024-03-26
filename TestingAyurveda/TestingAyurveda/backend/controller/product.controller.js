import Product from "../model/product.model.js";

export const getProductByCategory = (request, response, next) => {
    Product.findAll({ where: { categoryname: request.params.categoryName } })
        .then(result => {
            return response.status(200).json({ productList: result })
        }).catch(err => {
            console.log(err);
            return response.status(500).json({ error: "Internal Server Error" });
        })
}

export const getProductList = async (request, response, next) => {
    Product.findAll()
        .then(result => {
            return response.status(200).json({ productList: result });
        }).catch(err => {
            return response.status(500).json({ error: "Internal Server Error" });
        })
}

export const Add = (request, response, next) => {

    Product.create({
        title: request.body.title,
        brand: request.body.brand,
        price: request.body.price,
        description: request.body.description,
        imageUrl: request.body.imageUrl,
        categoryname: request.body.categoryname
    })
        .then((result) => {
            return response.status(200).json({ message: "Product Saved...." });
        })
        .catch((err) => {
            console.log(err);
            return response.status(500).json({ error: "Internal server error...", err });
        })
}

export const saveInBulk = async (request, response, next) => {
    try {
        let productList = request.body.products;

        for (let product of productList) {
            let { id, title, brand, price, description, imageUrl, categoryname } = product;

            await Product.create({
                id, title, brand, price, description, imageUrl, categoryname
            })
        }
        return response.status(200).json({ message: "All Product Saved...." });
    } catch (err) {
        console.log(err);
        return response.status(500).json({ error: "Internal Server Error" });
    }
}