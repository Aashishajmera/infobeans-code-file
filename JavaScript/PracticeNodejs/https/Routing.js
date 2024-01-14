import http from 'http';
import url from 'url';

const server = http.createServer((req, res)=>{
    console.log(url);
    if(req.url == "/"){
        res.write("This is home page");
    }else if(req.url == "/about"){
        res.write("This is about page");
    }else{
        res.writeHead(404, {'content-type': 'text/html'});
        res.write("SOMETHING WENT WRONG.....")
    }
    res.end();
});

server.listen(3000, ()=>{
    console.log("server called...");
})