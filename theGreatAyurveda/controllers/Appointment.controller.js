import Appointment from "../modules/appointment.module.js";

// appointment
export const appointment = (req, res) => {
  const appointmentDate = new Date()
    .toISOString()
    .slice(0, 19)
    .replace("T", " "); // Format: YYYY-MM-DD HH:MM:SS
  const status = req.body.status;
  const userId = req.body.userId;
  const doctorId = req.body.doctorId;

  // create a object of appointment class
  const appointment = new Appointment(
    null,
    appointmentDate,
    status,
    userId,
    doctorId
  );

  appointment
    .appointment()
    .then((result) => {
      if (result.length != 0) {
        return res
          .status(200)
          .json({ message: "Appointment request successfully send" });
      } else {
        return res.status(200).json({ message: "Data not found..." });
      }
    })
    .catch((err) => {
      return res.status(500).json({ err: "Internal server error", err });
    });
};

// appointment history
export const appointmentHistory = (req, res) => {
  const userId = req.body.userId;

  Appointment.appointmentHistory(userId)
    .then((result) => {
      if (result.length != 0) {
        return res.status(200).json({ result });
      } else {
        return res.status(200).json({ message: "data not found" });
      }
    })
    .catch((err) => {
      return res.status(500).json({ error: "Internal server error: ", err });
    });
};

// appointment list
export const appointmentList = (req, res) => {
  Appointment.appointmentList()
    .then((result) => {
      if (result.length != 0) {
        return res.status(200).json({ result });
      } else {
        return res.status(200).json({ message: "data not found" });
      }
    })
    .catch((err) => {
      return res.status(500).json({ error: "Internal server error: ", err });
    });
};

export const manageAppointment = (req, res) => {
  const status = req.body.status;
  const id = req.body.id;

  Appointment.manageAppointment(status, id)
    .then((result) => {
      if (result.affectedRows)
        return res.status(200).json({ message: "update successfully", result });
    else
        return res.status(200).json({message: 'data not found'})
    })
    .catch((err) => {
      return res.status(500).json({ err: "Internal server error..." });
    });
};
