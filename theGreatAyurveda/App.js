import bodyParser from "body-parser";
import express from 'express';
import path from "path";
import { fileURLToPath } from "url";
import { AppointmentRouter } from "./routers/Appointment.router.js";
import { DoctorRouter } from "./routers/Doctor.router.js";
import { DoctorDetailsRouter } from "./routers/DoctorDetails.router.js";
import { DoctorFeedbackRouter } from "./routers/DoctorFeedback.router.js";



// CREATE APP LEVEL MIDDLEWARE
const app = express();


app.use(bodyParser.urlencoded({extended: true}))
app.use(bodyParser.json());


// get a file path
const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename); 


// get a image file path
app.use(express.static(path.join(__dirname, 'public')));;



// DOCTOR MODULE

// Call the doctor router
app.use('/doctor', DoctorRouter);

// Call the doctorFeedback router
app.use('/doctorFeedback', DoctorFeedbackRouter)

// Call the doctorDetails router
app.use('/doctorDetails', DoctorDetailsRouter)

// Call the appointment router
app.use('/appointment', AppointmentRouter)

// CREATE A SERVER
app.listen(3000, ()=>{
    console.log("Server called...");
})