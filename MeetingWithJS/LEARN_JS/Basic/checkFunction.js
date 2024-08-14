// let inner;

// function outerFunction() {
//     const innerFunction = function() {
//         console.log('Inner function called');
//     }
//     inner = innerFunction;
// }

// outerFunction();
// inner(); // Output: Inner function called

// if(" "){
//     console.log('true');
// }else{
//     console.log("false");
// }

// class A{
//     calculate(){
//         console.log("I am parent calculate");
//     }
// }

// class Test extends A{
//     calculate(){
//         console.log("I am child calculate");
//     }
// }

// const obj = new Test();

// obj.calculate();

function* f1(){
    console.log("I am called...");
    yield ()=>{
        console.log('i am arrow');
    };
    yield 2;
    yield 3;
}

const demo = f1();

console.log(demo.next().value());
console.log(demo.next());

// function User() {
//   this.name = "Bob";
//   this.email = "email";

//   function m1() {
//     console.log(" i am m2");
//   }
// }
