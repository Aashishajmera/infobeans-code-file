import DoctorFeedback from "../modules/DoctorFeedback.module.js";

// call the doctorFeedback
export const doctorFeedback = (req, res) => {
  const ratingStar = req.body.ratingStar;
  const reviewText = req.body.reviewText;
  const userId = req.body.userId;
  const doctorId = req.body.doctorId;

  // create a object of doctorfeedback
    const doctorFeedback = new DoctorFeedback(null, ratingStar, reviewText, userId, doctorId);

    doctorFeedback.doctorFeedback().then((result)=>{
        return res.status(201).json({message: 'Doctor feedback successfull...', result});
    }).catch((err)=>{
        return res.status(400).json({err: "Server side error...", err});
    })
};
