function f1(callback) {
    let b;
    callback(b);
  let a = 9;
  if (10 > a) {
    console.log("I am f1");
    b = 100;
  }
}


f1((b)=>{
    console.log("I am callback b value is: ",b);
})