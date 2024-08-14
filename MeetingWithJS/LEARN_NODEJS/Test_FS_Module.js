import fs from 'fs';

// console.log(fs);

// asynchronous task
// fs.readFile('file.txt', 'utf-8', (err, data)=>{
//     if(err){
//         console.log("Something went wrong", err);
//     }else{
//         console.log(data);
//     }
// })
// console.log("finish reading file");


// synchronous task
// try {
//     const data = fs.readFileSync('file.txt', 'utf-8')
//     console.log(data);
// } catch (error) {
//     console.log(error);
// }
// console.log("finish reading file");



// File path and content
const filePath = 'example2.txt';
const fileContent = 'Hello, world! This is the content written at the time of file creation.\n';

// Create file and write content
// fs.writeFile(filePath, fileContent, (err) => {
//   if (err) {
//     console.error('Error:', err);
//   } else {
//     console.log('File created and content written successfully!');
//   }
// });


// write data without override existing content
// fs.appendFile(filePath, fileContent, (err) => {
//     if (err) {
//       console.error('Error:', err);
//     } else {
//       console.log('File created and content written successfully!');
//     }
//   });