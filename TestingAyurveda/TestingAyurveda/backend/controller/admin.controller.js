import { validationResult } from "express-validator";
import Admin from "../model/admin.model.js";
import jwt from "jsonwebtoken";

export const signIn = async (request, response, next) => {
    const errors = validationResult(request); 
    if (!errors.isEmpty())
        return response.status(401).json({ error: errors.array() });

    let email = request.body.email;
    let password = request.body.password;

    let admin = await Admin.findOne({ where: { email: email }, raw: true });
    if (admin) {
        if (Admin.checkPassword(password, admin.password)) {
            let payload = { subject: email };
            let token = jwt.sign(payload, 'fdfjfjrwieroerivxcnmvnnvrweiorddfsdfdlkfjlfjljlraj');
            return response.status(200).json({ message: "Sign In Success", admin, token: token });
        } else {
            return response.status(401).json({ error: "Unauthorized admin" });
        }
    }
    else
        return response.status(401).json({ error: "Unauthorized admin" });
}

export const SignUp = (request, response, next) => {
    const errors = validationResult(request);
    if (!errors.isEmpty())
        return response.status(401).json({ error: errors.array() });
    Admin.create({
        name: request.body.name,
        email: request.body.email,
        password: request.body.password
    })
        .then((result) => {
            return response.status(200).json({ data: result.dataValues, message: "admin created..." });
        })
        .catch((err) => {
            console.log(err);
            return response.status(500).json({ error: "Internal server error...", err });
        })
}

export const list = (request, response, next) => {
    Admin.findAll({ raw: true })
        .then((result) => {
            return response.status(200).json({ data: result });
        })
        .catch((err) => {
            return response.status(500).json({ error: "Internal server error...", err });
        })
}

export const listbyemail = (request, response, next) => {
    const errors = validationResult(request);
    if (!errors.isEmpty())
        return response.status(401).json({ error: errors.array() });

    Admin.findOne({
        where: { email: request.body.email }, raw: true
    })
        .then((result) => {
            if (result)
                return response.status(200).json({ data: result });
            return response.status(401).json({ message: 'unauthorized request' });
        })
        .catch((err) => {
            return response.status(500).json({ error: 'internal server err.....' })
        })
}

export const remove = (request, response, next) => {
    const errors = validationResult(request);
    if (!errors.isEmpty())
        return response.status(401).json({ error: errors.array() });

    Admin.destroy({
        where: { email: request.body.email }, raw: true
    })
        .then((result) => {
            if (result)
                return response.status(200).json({ message: 'admin deleted....' })
            return response.status(401).json({ message: 'unauthorized request....' })
        })
        .catch((err) => {
            return response.status(500).json({ error: "Internal server error.....", err })
        })
}

export const update = (request, response, next) => {
    const errors = validationResult(request);
    if (!errors.isEmpty())
        return response.status(401).json({ error: errors.array() });

    Admin.update(
        {
            name: request.body.name,
            email: request.body.email,
            password: request.body.password
        },
        {
            where: { id: request.body.id },
            raw: true
        }
    )
        .then((result) => {
            // console.log(result)
            if (result[0])
                return response.status(200).json({ message: 'admin updated....' })
            return response.status(401).json({ message: 'unauthorized request....' })
        })
        .catch((err) => {
            return response.status(500).json({ error: 'internal server error....', err })
        })
}