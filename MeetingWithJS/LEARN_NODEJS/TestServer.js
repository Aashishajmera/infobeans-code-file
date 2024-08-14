import {createServer} from 'http';

const server = createServer((req, res)=>{
    res.write("hii");
    res.write(req)
    res.end("end");
});


server.listen(3000, ()=>{
    console.log("Server started...");
});