import path from 'path';
import url, { fileURLToPath } from 'url';


// console.log(fileURLToPath);
const __filename = fileURLToPath(import.meta.url);   // get a full path of this file 
// console.log(url);
console.log(__filename);
const __dirname = path.dirname(__filename);  // get a directory path of this file
console.log(__dirname);
// console.log(path);
