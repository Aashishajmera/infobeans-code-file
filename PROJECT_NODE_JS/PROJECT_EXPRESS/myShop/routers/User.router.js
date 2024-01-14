import express from 'express';
import {signUp, signIn, updateDetails} from '../controllers/User.controller.js';


const router = express.Router();


router.post('/signUp', signUp);

router.post("/signIn", signIn);

router.post('/updateDetails', updateDetails)


export default router;