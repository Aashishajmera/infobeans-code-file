(function (){
    let arr = [1,3,45,6,8, 3,6];
    let size = arr.length;

    for(let i = 0; i < size; i++){
        for(let j = i+1; j < size; j++){
            if(arr[i] === arr[j]){
                for(let k = j; k < size-1; k++){
                    arr[k] = arr[k+1];
                }
                j--;
                size--;
            }
        }
    }

    for(let i = 0; i < size; i++){
        console.log(arr[i]);
    }
})();