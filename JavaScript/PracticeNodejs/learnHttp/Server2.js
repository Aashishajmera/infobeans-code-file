import fs from "fs";
import http from "http";
import path from "path";
import url, { fileURLToPath } from "url";

http
  .createServer((req, res) => {
    // console.log("================= I AM URL==================");
    // console.log(url);
    // console.log("================= I AM PATH ===============");
    // console.log(path);

    // get a file path
    const __filename = fileURLToPath(import.meta.url);
    // console.log(__filename);

    // get a directory name
    const __dirname = path.dirname(__filename);
    // console.log(__dirname);

    // get a url as a object
    const urlObj = url.parse(req.url, true);
    // console.log(urlObj);
    // console.log(urlObj.pathname);

    if (urlObj.pathname == "/" || urlObj.pathname == "/index.html") {
      const indexFilePath = path.join(__dirname + "/htmlFile/index.html");
      const indexFileRead = fs.readFileSync(indexFilePath);
      res.write(indexFileRead);
    } else if (urlObj.pathname == "/about.html") {
      const aboutFilePath = path.join(__dirname + "/htmlFile/about.html");
      const aboutFileRead = fs.readFileSync(aboutFilePath);
      res.write(aboutFileRead);
    } else if (urlObj.pathname.match("/.css")) {
        const cssFilePath = path.join(__dirname +"./cssFile/style.css");
        const cssFileData = fs.createReadStream(cssFilePath);
        res.write(cssFileData);
    } else {
      res.write("SOMETHING WENT WRONG.....");
    }
    res.end();
  })
  .listen(3000, () => {
    console.log("Server start.......");
  });
