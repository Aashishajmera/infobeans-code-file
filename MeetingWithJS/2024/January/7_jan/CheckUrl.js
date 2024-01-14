import url from "url";
import http from "http";

console.log(url);

// const urlObj = url.parse('http://localhost:8080/default.htm?year=2017&month=february');
// console.log(urlObj);

const server = http.createServer();

server.on('request', (req, res)=>{
    res.write("I am https module")
    console.log("====================================================");
    console.log("I am req url ");
    console.log(req.url);
    console.log("====================================================");
    console.log("I am url obj");
    const urlObj = url.parse(req.url, true);
    console.log(urlObj);
    console.log(urlObj.hostname);
    console.log("====================================================");
    res.end();
})

server.listen(3000, () => {
  console.log("Server is started.......");
});
