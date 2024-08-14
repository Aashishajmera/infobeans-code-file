import jwt from "jsonwebtoken";

export const verifyToken = (req, res, next) => {
  try {
    let token = req.headers.authorization;

    token = token.split(" ")[1];

    jwt.verify(token, "aashishtoken");

    next();
  } catch (err) {
    return res.status(401).json({msg: 'Unothorized user'});
  }
};
