import fs from 'fs';

const readData = fs.createReadStream('abc.txt');
const writeData = fs.createWriteStream('xyz.txt', {flags: 'a'});

readData.pipe(writeData);

console.log("data added....");