const myPromise = new Promise((resolve, reject) => {
  let age = 33;
  if (18 > age) {
    setTimeout(() => {
      resolve("I am resolve after 3 second");
    }, 6000);
  } else {
    setTimeout(() => {
      reject("i am reject after 1 second");
    }, 4000);
  }
});

const myPromise2 = new Promise((resolve, reject) => {
    let age = 33;
    if (18 > age) {
      setTimeout(() => {
        resolve("I am resolve after22222 3 second");
      }, 2000);
    } else {
      setTimeout(() => {
        reject("i am reject after2222 1 second");
      },1000);
    }
  });

myPromise
  .then((result) => {
    console.log(result);
  })
  .catch((error) => {
    console.log(error);
  });

  myPromise2
  .then((result) => {
    console.log(result);
  })
  .catch((error) => {
    console.log(error);
  });

console.log("hi");
