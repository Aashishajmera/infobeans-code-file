let promise = new Promise((resolve, reject) => {
  setTimeout(() => {
    let err = false;
    if (!err) {
      resolve({ userName: "Aashish", id: 101 });
    } else {
      reject("SOMETHING WENT WRONG");
    }
  }, 1000);
});

// promise
//   .then((user) => {
//     return user.userName;
//   })
//   .then((userName) => {
//     console.log(userName);
//   }).catch((err)=>{
//     console.log(err);
//   }).finally(()=>{
//     console.log("All done");
//   })

async function consumePromise() {
  try {
    let userDetails = await promise;
    console.log(userDetails);
  } catch (error) {
    console.log(error);
  }
}

consumePromise();
