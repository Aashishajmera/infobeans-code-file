(function () {
  function checkAnagram(str1, str2) {
    if (str1.length !== str2.length) {
        console.log('length not equal');
      return false;
    }

    function convertLowerCase(str) {
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

    let lowerCaseStr1 = convertLowerCase(str1);
    let lowerCaseStr2 = convertLowerCase(str2);

    function shortStr(str) {
      let arr = [];
      for (let i = 0; i < str.length; i++) {
        arr[i] = str.charAt(i);
      }

      for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr.length - i - 1; j++) {
          if (arr[j] > arr[j + 1]) {
            let temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
          }
        }
      }
      return arr;
    }
    let shortArr1 = shortStr(lowerCaseStr1);
    let shortArr2 = shortStr(lowerCaseStr2);

    for (let i = 0; i < shortArr1.length; i++) {
      if (shortArr1[i] !== shortArr2[i]) {
        return false;
      }
    }

    return true;
  }

  let str1 = "AAShish";
  let str2 = "shkiaah";

  let flag = checkAnagram(str1, str2);
  if (flag) {
    console.log("String is anagram ");
  } else {
    console.log("String is not anagram ");
  }
})();
