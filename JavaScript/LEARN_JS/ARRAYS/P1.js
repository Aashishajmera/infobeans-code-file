// array always make shallow copy ==> to change original array

let myArr = [1,2,4,5,true,"Hello",4.5];
console.log(myArr);
console.log("=========================");

const myFriend = new Array("Rohit", "Vivek", "Ankit", "Pawan", "Rahul", "Sachin", "Pradumya");
console.log(myFriend);
myFriend.push("Raj")  // add value in last
console.log(myFriend);
myFriend.pop();  // delete last value
console.log(myFriend);  
myFriend.unshift("Deepak") // add value in first
console.log(myFriend);
myFriend.shift() // delete first value
console.log(myFriend);

// check value
console.log(myFriend.includes("Vivek"));
// check the index
console.log(myFriend.indexOf("Vivek"));

// convert to the string comma sefrate
const newArr = myFriend.join();
console.log(newArr);

console.log("================================");
// splice method
const arr = [1,2,3,4,5];
console.log(arr);

const newArr2 = arr.splice(0,2);  // 0 index se 2 element delete 
console.log(newArr2);
console.log("original arr", arr);

// const newArr2 = arr.splice(0,2);  // 0 index se 2 element delete 
// console.log(newArr2);

// console.log(arr.splice(0,2), arr);
// console.log(arr.splice(0,4) , arr);
