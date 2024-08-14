(function (){
    let arr = [1,2,3,4];
    let arr2 =[5,6,7,8];
    let final = new Array(arr.length + arr2.length);
    let index = -1;
    
    for(let i = 0; i < arr.length; i++){
        final[++index] = arr[i];
    }
    for(let i = 0; i < arr2.length; i++){
        final[++index] = arr2[i];
    }
    
    console.log(final)
})();