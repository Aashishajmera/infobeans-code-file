import fs from "fs";

// fs.readFile("abc.txt", (err, data) => {
//   if (err) {
//     console.log(err);
//   } else {
//     console.log(data.toString());
//   }
// });

// fs.readFile("abc.txt","utf-8", (err, data) => {
//   if (err) {
//     console.log(err);
//   } else {
//     console.log(data);
//   }
// });

// IN CASE OF SYNC
// const theFile = fs.readFileSync('abc.txt');
// console.log(theFile.toString());

const theFile = fs.readFileSync("abc.txt", "utf-8");
try {
  console.log(theFile);
} catch (error) {
  console.log(error);
} finally {
  console.log("hii");
}
