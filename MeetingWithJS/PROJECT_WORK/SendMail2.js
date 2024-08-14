// import nodemailer from 'nodemailer';

const nodemailer = require("nodemailer");

const transporter = nodemailer.createTransport({
    service: 'gmail',
    auth: {
        user: 'thegreatayurveda@gmail.com',
        pass: 'mscy bdjt dttl plbj'
    }   
});


const sendOTP = () => {

    const mailOptions = {
        from: 'thegreatayurveda@gmail.com',
        to: "aashishajmera01@gmail.com",
        subject: 'Ta',
    };

    transporter.sendMail(mailOptions, function (error, info) {
        if (error) {
            console.log('Error sending email:', error);
        } else {
            console.log('Email sent successfully...');
        }
    });
};

sendOTP();