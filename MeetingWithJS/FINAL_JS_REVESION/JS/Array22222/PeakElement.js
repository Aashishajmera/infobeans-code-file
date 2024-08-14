(function () {
  let arr = [1, 2, 3, 4, 5, 4, 3, 2, 1];
  let newArr = [];

  let index = -1;

  if (arr[0] > arr[1]) {
    newArr[++index] = arr[0];
  }

  if(arr[arr.length-1] > arr[arr.length-2]){
    newArr[++index] = arr[arr.length-1];
  }

  for(let i = 1; i < arr.length -1; i++){
    if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
        newArr = arr[i];
    }
  }

  console.log(newArr);
})();
