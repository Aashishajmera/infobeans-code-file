const first = (n) => {
  console.log("Inside First : " + n);
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve(n + 2);
    }, 1000);
  });
};

const second = (n) => {
  console.log("Inside Second : " + n);
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve(n + 2);
    }, 1500);
  });
};

const third = (n) => {
  console.log("Inside Third : " + n);
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve(n + 2);
    }, 1000);
  });
};

const fourth = (n) => {
  console.log("Inside Fourth : " + n);
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve(n + 2);
    }, 800);
  });
};

// first(10)
// .then((resolvedValue)=>{return second(resolvedValue)})
// .then(resolvedValue=>{return third(resolvedValue)})
// .then(resolvedValue=>{fourth(resolvedValue)});

first(10)
  .then((resolvedValue) => {
    return second(resolvedValue);
  })
  .then((resolvedValue) => {
    return third(resolvedValue);
  })
  .then((resolvedValue) => {
    fourth(resolvedValue);
  })
  .then((revalue) => {
    console.log("I am fourth resolve...." + revalue);
  });
