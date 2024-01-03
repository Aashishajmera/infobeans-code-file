let p1 = new Promise((a, b) => {
    console.log("Inside promise");
  setTimeout(() => {
    if (10 % 2 == 0) {
      a("Number is even....");
    } else {
      reject("Number is odd....");
    }
  }, 1000);
});

p1.then((value) => {
  console.log(value);
}).catch((value) => {
  console.log(value);
});
