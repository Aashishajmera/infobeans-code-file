// Function that returns a Promise
function fetchData() {
  return new Promise((resolve, reject) => {
    // Simulating an asynchronous operation (e.g., making an API request)
    setTimeout(() => {
      const data = { message: "Data fetched successfully!" };
      // Resolve the promise with the data
      resolve(data);
      // Alternatively, reject the promise with an error
      // reject(new Error('Failed to fetch data'));
    }, 1000);
  });
}

async function f1() {
  const pro = await fetchData();
  console.log(pro);
}
console.log("hii");

f1();

//   // Using the Promise
//   fetchData()
//     .then((result) => {
//       console.log('Success:', result);
//     })
//     .catch((error) => {
//       console.error('Error:', error);
//     });

// console.log("HIi");
