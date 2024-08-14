(function (){
    let str = 'aashish ajmera';
    let arr = str.split(' ');
    let newStr = '';

    for(let i = 0; i < arr.length; i++){
        for(let j = arr[i].length -1; j >= 0; j--){
            newStr += arr[i].charAt(j);
        }
        newStr += ' ';
    }
    console.log(newStr);
})();