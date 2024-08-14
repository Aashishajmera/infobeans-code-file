(function (){
    let arr = [1,2,34,5];
    let count = 0;

    for(let index in arr){
        count ++;
    }

    for(let i = count-1; i >= 0; i--){
        console.log(arr[i]);
    }

})();