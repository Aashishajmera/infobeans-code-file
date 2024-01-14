import http from "http";

// take a url
import url,{fileURLToPath} from "url";

// To create a server
import fs from 'fs';
import path from 'path';
http
  .createServer(function (request, respond) {
    respond.write("Hello I am Home page.");
    
    respond.end();
  })
  .listen(3000, () => {
    console.log("Server called....");
  });
