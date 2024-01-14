import fs from "fs";
import url from "url";
import path from "path";
import http from "http";

// convert url as a object

// create a server
const server = http.createServer();

server.on("request", (req, res) => {
  // convert url as a object
  const urlObj = url.parse(req.url, true);

  // get a file path
  const __filename = url.fileURLToPath(import.meta.url);

  // get a directory name
  const __dirname = path.dirname(__filename);

  //   get a indexfile path
  const indexFilePath = path.join(__dirname + "/index.html");

//   read index file
  const readIndexPath = fs.readFileSync(indexFilePath);
  res.write(readIndexPath);

 if(urlObj.pathname.match('\.css') == '/'){
     //   add css file
     const cssFilePath = path.join(__dirname,urlObj.pathname);
     const readFilePath = fs.readFileSync(cssFilePath);
     res.write(readFilePath);
 }

  res.end();
});

server.listen(3000, () => {
  console.log("Server started....");
});
