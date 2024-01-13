import express from 'express';
import { signIn, signUp } from '../controllers/Admin.controller.js';



// ROUTER LEVEL MIDDLEWARE
const router = express.Router();

router.post('/signUp', signUp);
router.post('/signIn', signIn)

export default router;