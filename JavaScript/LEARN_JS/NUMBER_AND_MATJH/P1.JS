let score = 400;
console.log(score);
console.log(score.toString().length);


let balance = new Number(100);
console.log(balance);
// console.log(balance.length);
console.log(balance.toString().length);
console.log(balance.toFixed(2));


const otherString = 134.899876;
console.log(otherString.toPrecision(2));  // point ke pahle 3 digit hai ish lie output not good
console.log(otherString.toPrecision(5));
console.log(otherString.toPrecision(4));
console.log(otherString.toPrecision(12));   // digit se jayda value dene se last me 0 add kr dega

const amount = 200009700;
console.log(amount.toLocaleString());  //US standard
console.log(amount.toLocaleString('en-IN'));  // INDIA standard


// CHECK THE MAX AND MIN LENGTH OF NUMBER
console.log(Number.MAX_VALUE);
console.log(Number.MIN_VALUE);
console.log(Number.MAX_SAFE_INTEGER);
console.log(Number.MIN_SAFE_INTEGER);


console.log("===============MATH==============");

// ABSOLUTE VALUE
console.log(Math.abs(-55));
console.log(Math.round(4.4));  // value to pura krne ke lie
console.log(Math.ceil(4.1));  // thoda bhi jayda hai to pura krna
console.log(Math.floor(4.9));   // jyada se koi matlab nhi hai


console.log(Math.min(3,5,22,5,-8));
console.log(Math.max(3,5,22,5,-8));


console.log('==================RANDOM===============');
console.log(Math.random());   // to give random value

const min = 10;
const max = 20;

console.log(Math.floor(Math.random() *10));  // a to 10
console.log(Math.floor(Math.random() * (max-min+1))+min);  // 10 to 20
