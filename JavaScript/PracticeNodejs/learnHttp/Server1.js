import http from "http";

// take a url

import url from "url";

// To create a server
http
  .createServer(function (request, respond) {
    // convert the url
    let parseUrl = url.parse(request.url, true);
    console.log(parseUrl);

    if (parseUrl.pathname == "/" || parseUrl.pathname == "/home") {
      respond.write("Hii I am home page... ");
      respond.write(request.url)
      //   respond.write(parseUrl.pathname);
      // respond.write(url);
    } else if (parseUrl.pathname == "/about") {
      respond.write("Hii I am about page... ");
    } else if (parseUrl.pathname == "/add") {
      let a = parseUrl.query.a * 1;
      let b = parseUrl.query.b * 1;
      respond.write("Addition is: " + (a + b));
    } else {
      respond.write("SOMETHIGN WENT WRONG");
    }

    // END RESPOND
    respond.end();
  })
  .listen(3000, () => {
    console.log("Server called....");
  });
