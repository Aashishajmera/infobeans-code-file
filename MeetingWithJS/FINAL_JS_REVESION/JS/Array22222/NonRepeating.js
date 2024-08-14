(function (){
    let arr = [1,2,3,4,5,6,6,5,4];

    for(let i = 0; i < arr.length; i++){
        let flag = false;
        for(let j = 0; j < arr.length; j++){
            if(arr[i] === arr[j]){
                if(i != j){
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            console.log('Non repeating element is: ', arr[i]);
        }
    }
})();