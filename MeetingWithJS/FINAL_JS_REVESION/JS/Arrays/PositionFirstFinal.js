(function (){
    let arr = [2, 3, -4, -1, 6, 7, -4, 3];
    let newArr = new Array(arr.length);
    let first = -1;

    for(let i = 0; i < arr.length; i++){
        if(arr[i] >= 0){
            newArr[++first] = arr[i];
        }
    }
    
    for(let i = 0; i < arr.length; i++){
        if(arr[i] < 0){
            newArr[++first] = arr[i];
        }
    }
    
    for(let i of newArr){
        console.log(i);
    }

})()