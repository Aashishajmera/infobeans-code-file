import express from 'express';   // default export

const app = express();

// console.log(app);

app.get('/home', (req, res, next)=>{
    res.write("I am home page...");
    res.end();
})

app.get('/about', (req, res, next)=>{
    res.write("I am about page...");
    res.end();
})

app.get('/contact', (req, res, next)=>{
    res.write("I am contact page...");
    res.end();
})

app.use((req, res, next)=>{
    res.write("I am home page...");
    res.end();
})

// create a server
app.listen(3000, ()=>{
    console.log("server called....");
})