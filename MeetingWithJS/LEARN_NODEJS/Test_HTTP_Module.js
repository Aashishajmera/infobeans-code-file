// let http from 'http';
import http from 'http';


const server = http.createServer((req, res)=>{
    res.statusCode = 200;
    res.setHeader('Content-Type', 'text/html')
    console.log(req.url);
    res.end('<h1>End </h1>')
    if(req.url == '/about'){
        console.log(req.url);
    }
    
})

server.listen(3000, ()=>{
    console.log('server started....');
})