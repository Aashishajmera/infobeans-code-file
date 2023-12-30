let f1 = () => {
  return new Promise((resolve, reject) => {
    if (10 % 2 == 0) resolve("number is even: ");
    else reject("number is odd: ");
  });
};

f1().then(value=>{
    console.log(value);
}).catch(value=>{
    console.log(value);
});