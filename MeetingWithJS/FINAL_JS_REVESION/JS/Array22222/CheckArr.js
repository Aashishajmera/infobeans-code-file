const checkArr = (arr1, arr2) =>{
    if(arr1.length !== arr2.length){
        return false;
    }

    for(let i = 0; i < arr1.length; i++){
        if(arr1[i] !== arr2[i]){
            return false;
        }
    }

    return true;
    
}

(function (){
   let flag = checkArr([1,2,4,3], [1,2,3,4]);
   if(flag){
    console.log('array element is equal: ');
   }else{
    console.log('array element is not equal: ');
   }
})();