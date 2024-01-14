// import stream from 'stream';
import fs from "fs";
import http from "http";

// create a server
const server = http.createServer();

// predefined emiter
server.on("request", (req, res) => {
  const writeable = fs.createWriteStream("xyz.txt", { flags: "a" });
  writeable.write("\nHii ai jakak");
  writeable.end();

  writeable.on("finish", () => {
    console.log("data write successfull...");
  });

  writeable.on("error", (err) => {
    console.log(err + " some errrrrr..............");
  });

  const readable = fs.createReadStream("xyz.txt");
  readable.on("data", (chunk) => {
    res.write(chunk);
  });
  readable.on("error", (err) => {
    res.write(err);
  });
  readable.on("end", () => {
    res.end();
  });
});

server.listen(3000, () => {
  console.log("server start....");
});
