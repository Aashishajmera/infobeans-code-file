(function (){
    let col = 9, space = parseInt(col/2);
    for(let i = 1; i <= 5; i++){
        let str = '';
        for(let j = 1; j <= space; j++){
            str += ' ';
        }
        space--;
        for(let j = 1; j <= i; j++){
            str += '* ';
        }
        console.log(str);
        str = '';
    }
})();