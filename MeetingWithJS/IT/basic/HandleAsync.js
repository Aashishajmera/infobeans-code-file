// function doSomethingAsync(callback) {
//     setTimeout(function() {
//       console.log("Task completed!");
//       callback();
//     }, 2000);
//   }
  
//   console.log("Start");
//   doSomethingAsync(function() {
//     console.log("Next task");
//   });
//   console.log("End");

function doSomethingAsync() {
    return new Promise(function(resolve, reject) {
      setTimeout(function() {
        console.log("Task completed!");
        resolve();
      }, 2000);
    });
  }
  
  console.log("Start");
  doSomethingAsync()
    .then(function() {
      console.log("Next task");
    })
    .catch(function(error) {
      console.error("Error:", error);
    });
  console.log("End");
  