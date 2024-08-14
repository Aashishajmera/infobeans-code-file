import jwt from "jsonwebtoken";

export const virifyToken = (req, res, next) => {
  try {
    const btoken = req.headers.authorization;
    const token = btoken.split(" ")[1];
    jwt.verify(token, "aashishtoken");
    next();
  } catch (error) {
    return res.status(404).json({msg: 'unauthorized user'});
  }
};
