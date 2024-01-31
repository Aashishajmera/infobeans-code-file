import jwt from 'jsonwebtoken';
export const verifyToken = (req, res, next)=>{
    try {
        let token = req.headers.authorization;
        token = token.split(' ');
        token = token[1];   
        console.log(token);
        jwt.verify(token, 'anythingKey')
        next();
    } catch (error) {
        return res.status(401).json({error: 'Unauthorized access: '})
    }
}