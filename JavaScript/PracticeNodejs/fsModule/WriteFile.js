import fs from 'fs';


// DATA OVERRIDE
// fs.writeFile("abc.txt", "I am tranee at Infobeans foundation", ()=>{
//     console.log("Data successfully added....");
// })
// console.log("work finish.....");


// NOT OVERRIDE
// fs.appendFile("abc.txt", "\nI am tranee at Infobeans foundation", ()=>{
//     console.log("Data successfully added....");
// })
// console.log("work finish.....");

// DATA OVERRIDE
// const theFile = fs.writeFileSync("abc.txt", "I am tranee at Infobeans foundation");
// console.log("work finish.....");

// DATA NOT OVERRIDE
const theFile = fs.appendFileSync("abc.txt", "\nI am tranee at Infobeans foundation");
console.log("work finish.....");