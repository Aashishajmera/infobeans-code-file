(function (){
    let n = 8;
    let count = 0;
    let arr = [];
    let index = -1;

    for(let i = 2; i <= Infinity; i++){
        let flag = false;
        for(let j = 2; j <= parseInt(i/2); j++){
            if(i%j == 0){
                flag = true;
                break;
            }
        }
        if(!flag){
            count++;
            arr[++index] = i;
        }
        if(count === n){
            break;
        }
    }

    console.log(arr);
})();