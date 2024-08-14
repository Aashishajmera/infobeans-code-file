(function (){
    let str = 'aashish ajmera aamla';
    let arr = str.split(" ");
    let newStr = '';

    // Aashish Ajmera Aamla

    for(let i = 0; i < arr.length; i++){
        for(let j = 0; j < arr[i].length; j++){
            if(arr[i].charCodeAt(j) >= 97 && arr[i].charCodeAt(j) <= 122 && j == 0){
                newStr += String.fromCharCode(arr[i].charCodeAt(j) - 32);
            }else{
                newStr += arr[i].charAt(j);
            }
        }
        newStr += ' ';
    }

    console.log(newStr);

})();