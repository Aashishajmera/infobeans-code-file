(function (){
    let row = 7;
    let half = parseInt(row/2) + 1;
    let sLoop = half-1;
    
    for(let i = 1; i <= row; i++){
        let str = '';
        if(i <= half){
            for(let j = 1; j <= i; j++){
                str += '*';
            }
        }else{
            for(let j = 1; j <= sLoop; j++){
                str += '*';
            }
            sLoop--;
        }
        console.log(str);
        str = '';
    }
})();