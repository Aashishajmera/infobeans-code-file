let gameName = "freefire";

console.log(gameName);
console.log(gameName.length);
// console.log(gameName.length());
console.log(gameName.charAt(2));
console.log(gameName.indexOf('f'));
console.log(gameName.lastIndexOf('f'));
console.log(gameName.toUpperCase());
console.log(gameName.substring(4,8));  // last index se 1 kam excluding last index


// GET THE SUB STRING
const anotherName = gameName.slice(2,5);
console.log(anotherName);


// REMOVE THE EMPTY SPACE
const newString = "   abc    "
console.log(newString);
console.log(newString.trim());

// REPLACE THE VALUE
const url = "https://a3b2ffgaming.com"
console.log(url.replace('a3b2', "A3B2"));

// CHECK THE VALUE
console.log(url.includes("a3b2"));  //true
console.log(url.includes("a3B2"));  //false

// SPLIT THE STRING
let address = "Dewas-khategaon-aamla"
console.log(address.split('-'));
