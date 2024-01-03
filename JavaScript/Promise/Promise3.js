new Promise((resolve, reject) => {
    setTimeout(() => {
     resolve({userName: "Aashish", id: 101})
    }, 2000);
  }).then((userDetails) => {
    console.log(userDetails);
  });
  