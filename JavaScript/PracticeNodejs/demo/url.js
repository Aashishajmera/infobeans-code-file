import http from "http";
import url from "url";

// create server
const server = http.createServer();

server.on("request", (req, res) => {
  let parsedUrl = url.parse(req.url, true);
  console.log(parsedUrl.pathname);

  res.write("Hii ");
  console.log(req.url);
  res.end();
  
});

server.listen(3000, () => {
  console.log("Server start......");
});

// defference between
// req.url and urlObj.pathname

//console.log(request.url);
//  let parsedUrl = url.parse(request.url,true);
//  console.log(parsedUrl);
