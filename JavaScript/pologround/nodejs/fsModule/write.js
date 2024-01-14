import fs from "fs";
import chalk from "chalk";

// console.log(fs);
// fs.writeFile("abc.txt", "I am student", (err) =>{
//     if(err){
//         console.log("Data not write");
//     }else{
//         console.log("Data successfully write....");
//     }
// })

fs.readFile("abc.txt", "utf-8", (err, data) => {
  if (err) {
    console.log(err);
  } else {
    console.log();
  }
});
