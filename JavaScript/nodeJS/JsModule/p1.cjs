let fs = require("fs");

// Write file
fs.writeFile("first.txt", "I am first file", function (err) {
  if (err) throw err;
  console.log("saved...");
});

// Read file
fs.readFile("first.txt", function (err) {
  if (err) throw err;
  console.log();
});
