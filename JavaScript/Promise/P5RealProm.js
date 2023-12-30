let f1 = (n) => {
  console.log("Inside first: " + n);
  return new Promise((resolve, reject) => {
    setTimeout(() => {
        // reject("I am reject: ");
      resolve(n + 2);
    }, 4000);
  });
};

let f2 = (n) => {
  console.log(`Inside second: ${n}`);
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve(n + 2);
    }, 1000);
  });
};

let f3 = (n) => {
  console.log(`Inside third ${n}`);
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve(n + 2);
    }, 2000);
  });
};

let f4 = (n) => {
  console.log(`Inside four: ${n}`);
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve(n + 2);
    }, 1200);
  });
};

f1(10)
  .then((value) => {
    return f2(value);
  })
  .then((value) => {
    return f3(value);
  })
  .then((value) => {
    return f4(value);
  });
