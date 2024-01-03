new Promise((resolve, reject) => {
  setTimeout(() => {
    if (10 % 2 == 0) {
      resolve();
    }
  }, 2000);
}).then(() => {
  console.log("EVEN");
});
