(function (){
    let arr = [1,1,2,2,2,3,4,5];
    let newArr = [];
    let index = -1;

    for(let i = 0; i < arr.length; i++){
        for(let j = 0; j < arr.length; j++){
            if(arr[i] === arr[j]){
                if(j < i || j > i){
                    break;
                }else if(i === j){
                    newArr[++index] = arr[i];
                }
            }
        }
    }

    for(let i = 0; i < newArr.length; i++){
        console.log(newArr[i]);
    }

})();