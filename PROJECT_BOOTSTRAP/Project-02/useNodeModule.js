import fs from "fs";
import http from "http";
import path from "path";
import url, { fileURLToPath } from "url";

// create a server
const server = http.createServer();

server.on("request", (req, res) => {
  // convert url into object
  const urlObj = url.parse(req.url, true);

  // get a file path
  const __filename = fileURLToPath(import.meta.url);
  console.log(__filename);

  // get a directory name
  const __dirname = path.dirname(__filename);
  console.log(__dirname);

  if (urlObj.pathname == "/" || urlObj.pathname == "/index.html") {
    //get a index file path
    const indexFilePath = path.join(__dirname + "/index.html");
    //   read data from index file
    const readIndexFile = fs.readFileSync(indexFilePath);
    res.write(readIndexFile);
  } else {
    // get a path of assets
    const assetsPath = path.join(__dirname + urlObj.pathname);
    console.log("===========" + assetsPath);
    // read image from assets file
    const readImage = fs.readFileSync(assetsPath);
    res.write(readImage);
    console.log("IMage path" + assetsPath);
  }
  res.end();
});

server.listen(3000, () => {
  console.log("server start.....");
});
