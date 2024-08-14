(function () {
  function convertLower(str) {
    let lower = "";
    for (let i = 0; i < str.length; i++) {
      if (str.charCodeAt(i) >= 65 && str.charCodeAt(i) <= 90) {
        lower += String.fromCharCode(str.charCodeAt(i) + 32);
      } else {
        lower += str.charAt(i);
      }
    }
    return lower;
  }

  let str = convertLower("Aashish ajmerA");
  let str2 = convertLower("aashish meraaj");

  function shortStr(str) {
    let arr = [];
    for (let i = 0; i < str.length; i++) {
      arr[i] = str.charAt(i);
    }

    for (let i = 0; i < arr.length; i++) {
      for (let j = 0; j < arr.length - i - 1; j++) {
       if(arr[j] > arr[j+1]){
        let temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
       }
      }
    }

    console.log(arr);
    return arr;
  }

  let arr1 = shortStr(str);
  let arr2 = shortStr(str2);


    let flag = false;
    for(let i = 0; i < arr1.length; i++){
      if(arr1[i] !== arr2[i]){
          flag = true;
      }
    }

    if(flag){
      console.log('Not anagram');
    }else{
      console.log('anagram');
    }

})();
