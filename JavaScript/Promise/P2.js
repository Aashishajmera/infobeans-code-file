let promise = new Promise((resolve, reject) => {
  resolve("Promise is resolve.....");
//   reject("Promise is reject....");
});

promise
  .then((value) => {
    console.log("then "+value);
  })
  .catch(() => {
    console.log("catch");
  });
