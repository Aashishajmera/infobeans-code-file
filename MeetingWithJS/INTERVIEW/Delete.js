(function (){
    let arr = [1,2,3];

    for(let i = 0; i < arr.length; i++){
        if(i === 1 && (i < arr.length - 1)){
            arr[i] = arr[i+1]
        }
    }
})()