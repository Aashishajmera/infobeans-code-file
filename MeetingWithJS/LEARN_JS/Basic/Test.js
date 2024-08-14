// console.log(__filename);
// console.log(__dirname);

// import fs from 'fs';

// const w = fs.createWriteStream("abc.txt");

// w.write("Hiii , I am mohan");
// w.write("Hello mohan , I am Aashish");

// w.on("finish", ()=>{
//     console.log("data write suc...");
// })



// const r = fs.createReadStream('abc.txt');

// r.on("data", (chun)=>{
//     console.log(chun.toString());
// })

const array1 = [1, 4, 9, 16];

const arr = array1.map((value)=>{
    console.log(value);
})