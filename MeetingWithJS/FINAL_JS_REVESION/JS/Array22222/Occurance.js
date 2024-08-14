(function (){
    let arr = [1,2,3,4, 4,4,3,5];
    
    for(let i = 0; i < arr.length; i++){
        let count = 0;
        for(let j = 0; j < arr.length; j++){
            if(arr[i] === arr[j]){
                if(j < i){
                    count = 0;
                    break;
                }else if(j >= i){
                    count++;
                }
            }
        }
        if(count !== 0){
            console.log(arr[i], ' present in ', count, ' time');
        }
    }
})();