(function (){
    let arr = [2,3,-4,-1,6,7,-4,3];
    for(let i = 0; i < arr.length; i++){
        if(arr[i] < 0){
            for(let j = i; j < arr.length; j++){
                if(arr[j] > 0){
                    arr[i] = arr[i]+arr[j];
                    arr[j] = arr[i]-arr[j];
                    arr[i] = arr[i]-arr[j];
                    break;
                }
            }
        }
    }
    for(let i of arr){
        console.log(i);
    }
})()