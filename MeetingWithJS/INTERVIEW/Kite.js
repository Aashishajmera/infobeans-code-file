(function (){
    let str = '';
    let k = 0;
    for(let i = 1; i <= 5; i++){
        for(let s = 1; s <= (5-i); s++){
            str += ' ';
        }
        for(let p = 1; p <= (i+k); p++){
            str += '*';
        }
        k ++;
        console.log(str);
        str = '';
    }
})();