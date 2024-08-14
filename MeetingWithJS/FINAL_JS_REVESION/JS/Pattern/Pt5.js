//         A
//       A B A
//     A B C B A
//   A B C D C B A
// A B C D E D C B A

(function (){
    
    let row = 5, space = (row -1)*2, value = 1;
    for(let i = 1; i <= row; i++){
        let str = '';
        for(let j = 1; j <= space; j++){
            str += ' ';
        }
        space -= 2;
        let code = 64;
        for(let j = 1; j <= value; j++){
            if(j <= i){
                str += String.fromCharCode(++code)+' ';
            }else{
                str += String.fromCharCode(--code)+' ';
            }
        }
        value += 2;
        console.log(str);
    }
 })();