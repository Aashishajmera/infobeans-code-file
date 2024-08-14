(function (){
    let arr = [1,2,1,2,3];

    for(let i = 0; i < arr.length; i++){
        let flag = true;
        for(let j = 0; j < arr.length; j++){
            if(arr[i] === arr[j]){
                if(j < i){
                    flag = false;
                    break;
                }else if(j > i){
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            console.log('first non repeating element is: ', arr[i]);
        }
    }
})();