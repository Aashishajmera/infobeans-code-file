import DoctorDetails from "../modules/DoctorDetails.module.js";

export const verifyDoctor = (req, res) => {
  const experience = req.body.experience;
  const gender = req.body.gender;
  const language = req.body.language;
  const clinicAddress = req.body.clinicAddress;
  const imageUrl = "images/" + req.files.imageUrl[0].filename;
  const qualificationImage = "images/" + req.files.qualificationImage[0].filename;
  const specialization = req.body.specialization;
  const doctorId = req.body.doctorId;

  // create a object of doctorDetails module
  const doctorDetails = new DoctorDetails(
    null,
    qualificationImage,
    experience,
    gender,
    language,
    clinicAddress,
    imageUrl,
    specialization,
    doctorId
  );

  doctorDetails
    .verifyDoctor()
    .then((result) => {
      return res
        .status(201)
        .json({ message: "Doctor verify successfull...", result });
    })
    .catch((err) => {
      return res.status(500).json({ error: "Internal server error...", err });
    });
};
