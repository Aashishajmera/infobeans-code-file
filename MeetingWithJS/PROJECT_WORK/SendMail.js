// mscy bdjt dttl plbj

const nodemailer = require("nodemailer");

const recepent = "jyotibirla1604@gmail.com";
const subject = "Forget Password";
const mail_msg = "Your new OTP is AYURVEDA";

const sendMail = async (recepent, subject, mail_msg) => {
  try {
    // connect with the smtp
    let transporter = await nodemailer.createTransport({
      service: "gmail",
      auth: {
        user: "thegreatayurveda@gmail.com",
        pass: "mscy bdjt dttl plbj",
      },
    });
    const mailOptions = {
      from: "thegreatayurveda@gmail.com",
      to: recepent,
      subject: subject,
      text: mail_msg,
    };
    await transporter.sendMail(mailOptions, (error, info) => {
      if (!error) {
        console.log("Email sent successfully: " + info);
        return true;
      } else throw new Error("Failed to send email" ,error);
    });
  } catch (error) {
    console.log(error);
    throw new Error("Failed to send email");
  }
};

sendMail();

// export default sendMail;
