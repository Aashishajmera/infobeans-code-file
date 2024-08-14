(function (){
    let arr = [1,2,3,4,5];

    for(let i = 0; i < arr.length; i++){
        if(i === 3){
            arr[i] = 9;
        }
    }

    console.log(arr);
})();