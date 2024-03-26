import { doctorFeedback } from "../controller/doctor.controller.js";
import Appointment from "./appointment.model.js";
import Cart from "./cart.model.js";
import CartItems from "./cartitems.model.js";
import Category from "./category.model.js";
import Doctor from "./doctor.model.js";
import DoctorFeedback from "./doctorFeedback.model.js";
import DoctorDetail from "./doctordetail.model.js";
import HomeRemedy from "./homeremedy.model.js";
import Product from "./product.model.js";
import User from "./user.model.js";
import Yoga from "./yoga.model.js";
console.log("Association Executed.......");

Category.hasMany(Product, {
  foreignKey: "categoryname",
});

Product.belongsTo(Category, {
  foreignKey: "categoryname",
  targetKey: "categoryName",
});

Category.hasMany(HomeRemedy, {
  foreignKey: "categoryname",
});

HomeRemedy.belongsTo(Category, {
  foreignKey: "categoryname",
  targetKey: "categoryName",
});

Category.hasMany(Yoga, {
  foreignKey: "categoryname",
});

Yoga.belongsTo(Category, {
  foreignKey: "categoryname",
  targetKey: "categoryName",
});

User.hasMany(Appointment, {
  foreignKey: "id",
});

Appointment.belongsTo(User, {
  foreignKey: "userId",
  targetKey: "id",
});

Doctor.hasMany(Appointment, {
  foreignKey: "id",
});

Appointment.belongsTo(Doctor, {
  foreignKey: "doctorId",
  targetKey: "id",
});

Appointment.hasMany(DoctorFeedback, {
  foreignKey: "id",
});

DoctorFeedback.belongsTo(Appointment, {
  foreignKey: "appointmentId",
  targetKey: "id",
});

User.hasMany(DoctorFeedback, {
  foreignKey: "id",
});

DoctorFeedback.belongsTo(User, {
  foreignKey: "userId",
  targetKey: "id",
});

Doctor.hasMany(DoctorFeedback, {
  foreignKey: "id",
});

DoctorFeedback.belongsTo(Doctor, {
  foreignKey: "DoctorId",
  targetKey: "id",
});

Doctor.hasOne(DoctorDetail, {
  foreignKey: "id",
});

DoctorDetail.belongsTo(Doctor, {
  foreignKey: "doctorId",
  targetKey: "id",
});

User.hasOne(Cart);
Cart.belongsTo(User);

Cart.belongsToMany(Product, { through: CartItems });
Product.belongsToMany(Cart, { through: CartItems });

export {
  Appointment, Cart,
  CartItems, Category, Doctor,
  DoctorDetail, HomeRemedy, Product,
  User, Yoga
};
