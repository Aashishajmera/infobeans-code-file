(function (){
    let str = '01010111011111000111111111';
    let arr = [];
    let temp = 0;
    
    for(let i = 0; i < str.length; i++){
        arr[i] = str.charAt(i);
    }

    for(let i = 0; i < arr.length; i++){
       let count = 1;
        for(let j = i; j < arr.length-1; j++){
            // if(arr[j] === arr[j+1] && arr[j] === '1'){
            //     count++;
            // }else{
            //     break;
            // }

        }
        if(temp < count){
            temp = count;
        }
    }

    console.log('maximam occurance of 1 is ', temp);

})();