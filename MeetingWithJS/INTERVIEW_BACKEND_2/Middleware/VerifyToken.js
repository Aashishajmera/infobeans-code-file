import jwt from 'jsonwebtoken';

export const verifyToken = (req, res, next) => {
   try {
    const token = req.headers.authorization;
    console.log(token);
   } catch (error) {
    return res.status(404).json({msg: 'Unauthorized user...', err})
   }
} 