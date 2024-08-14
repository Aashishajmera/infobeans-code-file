// // let obj = {name: 'Aashish', surname: 'Ajmera'};


// // console.log(obj);

// // obj.name = 'Deepak'

// // console.log(obj);

// // obj = {...obj, address: 'Aamla'}

// // const index = 'dist';

// // obj[index] =  'Dewas';

// // obj.state = 'M.P.'

// // console.log(obj);

// // obj.fun = function f1(){
// //     console.log('i am function');
// // }

// // obj.fun()
// // // console.log(obj.f1());


// function outerFunction() {
//   let outerVariable = 'I am from outerFunction';

//   function innerFunction() {
//     console.log(outerVariable); // Accessing outerVariable from the outer scope
//   }

//   return innerFunction;
// }

// const closure = outerFunction();
// closure(); // Output: I am from outerFunction


// Start a setTimeout
const timeoutId = setTimeout(() => {
    console.log('Timeout executed!');
}, 3000);

// Later, if you want to cancel the setTimeout
clearTimeout(timeoutId);
