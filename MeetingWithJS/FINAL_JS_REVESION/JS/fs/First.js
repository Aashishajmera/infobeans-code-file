import fs, { read, write } from 'fs';

// fs.writeFile('abc.txt', 'Hii, I am Aashish Ajmera' , (err)=>{
//     if(err){
//         throw err
//     }else{
//         console.log('data write successfully');
//     }
// });


// fs.appendFile('abc.txt', 'Hii, I am falana', (err)=>{
//     if(err){
//         throw err
//     }else{
//         console.log('data write successfullly....');
//     }
// })


// fs.readFile('abc.txt', 'utf-8', (err, data)=>{
//     if(err){
//         console.log(err);
//     }else{
//         console.log(data);
//         data.pipe()
//     }
// })

// const data = fs.createReadStream('abc.txt', 'utf-8');

// data.on('data', (chunk)=>{
//     console.log(chunk);
// })

// data.on('end', ()=>{
//     console.log('all data read');
// })

// data.on('error' , (err)=>{
//     console.log(err);
// })

const readable = fs.createReadStream('abc.txt', 'utf-8');

const writeable = fs.createWriteStream('xyz.txt');

readable.pipe(writeable);