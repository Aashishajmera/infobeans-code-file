// PRIMITIVE

// name => 2 to power 53
// bigint 
// String => "", ''
// boolean => true/false
// null => standalon value
// undefined => 
// symbol 


// SYMBOL
const id = Symbol('123');
const anotherId = Symbol('123');
console.log(id === anotherId);

// BIG INT
const bigNumber = 23456787654329832405n;
console.log(bigNumber);




// NOT PRIMITIVE (REFERENCE TYPE)
// array
// object
// function


let myArr = [2, true, "Hello", 4.3]
let myObj = {name: "My name", id: 101}
let myFun = function(){console.log("i am function");}


console.table([typeof(myArr), typeof(myObj), typeof(myFun)]);