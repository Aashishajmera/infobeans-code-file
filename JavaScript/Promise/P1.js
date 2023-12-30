// create object of promise class
let promise = new Promise((resolve, reject) => {
  reject();
  // resolve();
});

promise
  .then(() => {
    console.log("i am than");
  })
  .catch(() => {
    console.log("i am catch");
  });
