let http = require("http");
http
  .createServer(function (request, respond) {
    respond.write("Hiii.jk..");
    respond.end();
  })
  .listen(8080);
