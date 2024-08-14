// (function (){
//     let arr = [1,2,2,3,2,3,4,3,2,4,67,8];

//     let size = arr.length;

//     for(let i = 0; i < arr.length; i++){
//         for(let j = 0; j < arr.length-1; j++){
//             if(arr[j] == arr[j+1]){
//                 for(let k = j; k < arr.length-1; k++){
//                     arr[k] = arr[k+1];
//                 }
//                 size--;
//                 j--;
//             }
//         }
//     }

//     console.log('hi');
//     // arr.forEach((element)=>{
//     //     console.log(element);
//     // })

//     for(let i = 0; i < size; i++){
//         console.log(arr[i]);
//     }

// })();

// (function () {
//   let arr = [1, 2, 2, 3, 2, 3, 4, 3, 2, 4, 67, 8];
//   let uniqueArr = arr.filter((value, index, self) => {
//     console.log(self.indexOf(value) === index);
//     console.log('hi');
//    return self.indexOf(value) === index;
//   });

//   console.log(uniqueArr); // Output: [1, 2, 3, 4, 67, 8]
// })();

(function () {
  let arr = [1, 2, 2, 3, 2, 3, 4, 3, 2, 4, 67, 8];

  let obj = {};
  let uniqueArr = [];

  for (let i = 0; i < arr.length; i++) {
    if (!obj[arr[i]]) {
      uniqueArr.push(arr[i]);
      obj[arr[i]] = true;
    }
  }

  console.log(uniqueArr);
})();
