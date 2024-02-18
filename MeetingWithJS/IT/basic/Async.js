function f2() {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log("Inside f2 function...");
      resolve();
    }, 3000);
  });
}

function f3() {
  console.log("I am f3");
}

const f1 = async () => {
  console.log("start");
  const result = await f2();
  console.log("end");
};

f1();
f3();