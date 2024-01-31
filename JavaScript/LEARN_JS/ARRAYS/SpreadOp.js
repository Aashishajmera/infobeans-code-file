const firstArr = ['jan', "feb"]
const secondArr = ['march', 'april']


// concate two array spread operator
console.log("=======", ...firstArr);
const totalArr = [...firstArr, ...secondArr];
console.log(totalArr);


const anotherArr = [1,2,3,[4,5,6], 7,[6,7,[4,5]]];
const real_another_arr = anotherArr.flat(Infinity);
console.log(real_another_arr);

console.log(Array.isArray("Info"));  // check info is array or not
console.log(Array.from("Info"));   // conver info as array
console.log(Array.from({id: 101}));  // can't convert


let score1 = 100;
let score2 = 200;
let score3 = 300;

console.log(Array.of(score1, score2, score3));  // create a new array: 
