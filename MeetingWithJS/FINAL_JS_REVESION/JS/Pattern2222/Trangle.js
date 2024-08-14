(function (){
    for(let i = 1; i <= 5; i++){
        let line = '';
        let code = 64;
        for(let j = 1; j <= (5-i); j++){
            line += ' ';
        }
        for(let j = 1; j <= i; j++){
            line += String.fromCharCode(++code);
        }
        console.log(line);
    }

})();