import { validationResult } from "express-validator";
import Yoga from "../model/yoga.model.js";

export const getYogaByCategory = (request, response, next) => {
    Yoga.findAll({ where: { categoryname: request.params.categoryName } })
        .then(result => {
            return response.status(200).json({ YogaList: result })
        }).catch(err => {
            console.log(err);
            return response.status(500).json({ error: "Internal Server Error" });
        })
}

export const getYoga = async (request, response, next) => {
    Yoga.findAll()
        .then(result => {
            return response.status(200).json({ YogaList: result });
        }).catch(err => {
            return response.status(500).json({ error: "Internal Server Error" });
        })
}

export const viewParticularYoga = async (request, response, next) => {
    const errors = validationResult(request);
    if (!errors.isEmpty())
        return response.status(401).json({ error: errors.array() });

    Yoga.findOne({
        where: { id: request.body.id },
        raw: true
    })
        .then(result => {
            if (result)
                return response.status(200).json({ YogaList: result });
            return response.status(401).json({ error: "unauthaerized request" });
        }).catch(err => {
            return response.status(500).json({ error: "Internal Server Error" });
        })
}

export const Add = (request, response, next) => {
    const errors = validationResult(request);
    if (!errors.isEmpty())
        return response.status(401).json({ error: errors.array() });

    Yoga.create({
        yogaName: request.body.remedyName,
        benefits: request.body.description,
        instructions: request.body.ingredients,
        imageUrl: request.body.instructions,
        videoUrl: request.body.imageUrl,
        categoryname: request.body.categoryname
    })
        .then((result) => {
            return response.status(200).json({ message: "Yoga Saved...." });
        })
        .catch((err) => {
            console.log(err);
            return response.status(500).json({ error: "Internal server error...", err });
        })
}

export const Update = (request, response, next) => {
    const errors = validationResult(request);
    if (!errors.isEmpty())
        return response.status(401).json({ error: errors.array() });

    Yoga.update({
        yogaName: request.body.remedyName,
        benefits: request.body.description,
        instructions: request.body.ingredients,
        imageUrl: request.body.instructions,
        videoUrl: request.body.imageUrl,
        categoryname: request.body.categoryname
    },
        {
            where: { id: request.body.id },
            raw: true
        })
        .then((result) => {
            return response.status(200).json({ message: "Yoga Updated...." });
        })
        .catch((err) => {
            console.log(err);
            return response.status(500).json({ error: "Internal server error...", err });
        })
}

export const Remove = (request, response, next) => {
    const errors = validationResult(request);
    if (!errors.isEmpty())
        return response.status(401).json({ error: errors.array() });

    Yoga.destroy({
        where: { id: request.body.id },
        raw: true
    })
        .then((result) => {
            if (result)
                return response.status(200).json({ message: "Yoga Removed...." });
            return response.status(401).json({ message: "Unauthorized reguest...." });
        })
        .catch((err) => {
            console.log(err);
            return response.status(500).json({ error: "Internal server error...", err });
        })
}

export const saveInBulk = async (request, response, next) => {
    const errors = validationResult(request);
    if (!errors.isEmpty())
        return response.status(401).json({ error: errors.array() });

    try {
        let YogaList = request.body.Yogas;

        for (let yoga of YogaList) {
            let { id, yogaName, benefits, instructions, imageUrl, videoUrl, categoryname } = yoga;

            await Yoga.create({
                id, yogaName, benefits, instructions, imageUrl, videoUrl, categoryname
            })
        }
        return response.status(200).json({ message: "All Yoga Saved...." });
    } catch (err) {
        console.log(err);
        return response.status(500).json({ error: "Internal Server Error" });
    }
}