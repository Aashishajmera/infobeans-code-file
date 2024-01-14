import http from 'http';

const server = http.createServer((req, res) => {
    res.write("Hello i am server");
    res.end();
});


server.listen(3000, ()=>{
    console.log("server start....");
});