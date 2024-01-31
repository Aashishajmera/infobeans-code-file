import express from 'express';
import path, { dirname } from 'path';
import { fileURLToPath } from 'url';

// create a express object
const app = express();

// get a directory name
const __dirname = dirname(fileURLToPath(import.meta.url))

// get a file path
const filePath = path.join(__dirname, '../Files');

app.use(express.static(filePath));

// app.use((express.static(filePath), next)=>{
//     // express.static(filePath);
//     next();
// });


app.get('/about', (req, res)=>{
    res.send("i am about page")
})

// create a server
app.listen(3000, ()=>{
    console.log("Server started....");
})