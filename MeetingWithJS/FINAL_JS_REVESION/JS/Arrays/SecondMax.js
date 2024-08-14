(function (){
    let sMax = -Infinity; max = -Infinity;
    let arr = [3,1];
    for(let element of arr){
        if(element > max){
            sMax = max;
            max = element;
        }else if(element > sMax && element < max){
            sMax = element;
        }
    }
    console.log(sMax);
    console.log('Done...')
})();