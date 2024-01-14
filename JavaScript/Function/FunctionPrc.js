// // Simple function OR named function
// function firstFun() {
//   console.log("I am first function...");
// }

// firstFun();

// // anonymous function
// let secondFun = function () {
//   console.log("I am anonymous function....");
// };

// secondFun();

// // arrow function
// let thirdFun = () => {
//   console.log("I am arrow function....");
// };

// thirdFun();

// // callback function
// function firstFun(callbackFun) {
//   console.log("I am first function...");
//   callbackFun();
// }

// // let callbackFun = () => {};

// firstFun(function () {
//     console.log("I am callback function....");
// });

// // callback function
// let firstFun = function(callbackFun) {
//   console.log("I am first function...");
//   callbackFun();
// }

// // let callbackFun = () => {};

// firstFun(() =>{
//     console.log("I am callback function....");
// });

// ERROR FUNCTION
// function errFun(err, value){
//     if(err){
//         console.log(err);
//     }else{
//         console.log("Function successfully executed.....");
//     }
// }

// function f1(){
//     console.log("I am f1");
// }

// console.log(f1());

// function f2(){
//     setTimeout(() => {
//         console.log("I am f2");
//         setTimeout(() => {
//             console.log("I am f3");
//         }, 4000);
//     }, 2000);
// }

// f2();

// function f1(){
//    var a = 2;
// }
// console.log(a);

// f1()'

// for (const i = 0; i < 10; i++) {
// setTimeout(() => {
// console.log(i);
// }, 1000);
// }

// const a = null;
// console.log(a);

// const x = [1, 2, 3];
// (function (x) {
//   console.log(x);
//   x.push(4);
//   console.log(x);
// })(x);

// console.log(x);

// function init() {
//     var name = "Mozilla"; // name is a local variable created by init
//     function displayName() {
//       // displayName() is the inner function, that forms the closure
//       console.log(name); // use variable declared in the parent function
//     }
//     displayName();
//   }
//   init();

// async function f1(){
//     console.log("I am f1");
// };

// console.log(f1());

function f1(callback) {
  setTimeout(() => {
    callback();
    console.log("I am f1");
  }, 2000);
}

f1(() => {
  console.log("I am callback function.....");
});
