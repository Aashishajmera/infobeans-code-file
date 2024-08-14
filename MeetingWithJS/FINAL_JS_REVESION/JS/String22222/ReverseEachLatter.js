(function (){
    let str = 'Aashish Ajmera';
    let newStr = str.split(' ');
    let reverseStr = '';

    // for(let i = 0; i < newStr.length; i++){
    //     for(let j = newStr[i].length-1; j >= 0; j--){
    //         reverseStr += newStr[i].charAt(j);
    //     }
    //     reverseStr += ' ';
    // }

    for(let i = newStr.length-1; i >= 0; i--){
        for(let j = newStr[i].length-1; j >= 0; j--){
            reverseStr += newStr[i].charAt(j);
        }
        reverseStr += ' ';
    }

    console.log(reverseStr);
})();