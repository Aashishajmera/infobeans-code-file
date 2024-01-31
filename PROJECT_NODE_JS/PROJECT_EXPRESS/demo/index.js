import express from "express";
import jwt from 'jsonwebtoken';

// create a object of express
const app = express();

const secretKey = 'secretkey'

app.get('/', (req, res)=>{
    res.json({
        message: 'This is a simple api'
    })
})

app.post('/login', (req, res)=>{
    const user = {
        id: 101,
        name: 'Aashish',
        email: 'abc@gmail.com'
    }
    jwt.sign({user},secretKey, {expiresIn:'300s'}, (err, token)=>{
        res.json({
            token
        })
    })
})

app.post('/profile',verifyToken, (req, res, next)=>{
    jwt.verify(req.token, secretKey, (err, authData)=>{
        if(err){
            res.send({
                message: 'invalid token'
            })
        }else{
            res.json({
                message: 'profile accessed', authData
            })
        }
    })
})

// check token middle ware
function verifyToken(req, res, next){
    const bearerHeader = req.headers['authorization'];
    if(typeof bearerHeader != 'undefined'){
        const bearer = bearerHeader.split(" ");
        const token = bearer[1];
        req.token = token;
        next();
    }else{
        res.send({
            result: 'Token is not valid'
        })
    }
}

app.listen(3000, ()=>{
    console.log("Server started....");
})