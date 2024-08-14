// (function (){
//     let str = 'Aashish Ajmera';
//     let newStr = str.split(' ');

//     let reverseSt = '';

//     for(let i = 0; i < newStr.length; i++){
//         for(let j = newStr[i].length-1; j >= 0; j--){
//             reverseSt += newStr[i].charAt(j);
//         }
//         reverseSt += ' ';
//     }
//     console.log(reverseSt);
// })();



(function (){
    let str = 'Aashish Ajmera';
    let newStr = str.split(' ');
    let reverseStr = ''

    for(let i = newStr.length-1; i >= 0; i--){
        reverseStr += newStr[i];
        reverseStr += ' ';
    }

    console.log(reverseStr);
})();