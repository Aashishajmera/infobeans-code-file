let promise = new Promise((resolve, reject) => {
  setTimeout(() => {
    let err = true;
    if(!err){
        resolve({ userName: "Aashish", id: 101 });
    }else{
        reject("SOMETHING WENT WRONG");
    }
}, 2000);
});

promise
  .then((user) => {
    return user.userName;
  })
  .then((userName) => {
    console.log(userName);
  }).catch((err)=>{
    console.log(err);
  }).finally(()=>{
    console.log("All done");
  })
