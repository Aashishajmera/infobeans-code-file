import fs from "fs";

const Test1 = function () {
//   const w = fs.writeFileSync("abc.txt", "Hello , I am Aashish", {flag: 'a'});
//   console.log("Data write successfully...");

try {
    const r = fs.readFileSync('abc.txt', 'utf-8');
    console.log(r);
} catch (error) {
    console.log(error);
}    

};

Test1();