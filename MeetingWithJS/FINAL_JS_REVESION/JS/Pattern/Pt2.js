// *******
//  *****
//   ***
//    *

(function (){
    let k = 7;
    for(let i = 1; i <= 4; i++){
        let str = '';
        for(let j = 1; j < i; j++){
            str += ' ';
        }
        for(let j = 1; j <= k; j++){
            str += "*";
        }
    console.log(str);
        k -= 2;
    }
})();