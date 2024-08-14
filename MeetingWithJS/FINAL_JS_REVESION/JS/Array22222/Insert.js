(function (){

    let arr = [1,2,3,4,5];
    let index = -1;
    let newArr = [];
    let position = 5;

    if(arr.length >= position){
        for(let i = 0; i < (position-1); i++){
            newArr[++index] = arr[i];
        }
        newArr[++index] = 999;
        if((position-1) <= arr.length){
            for(let i = position-1; i < arr.length; i++){
                newArr[++index] = arr[i];
            }
        }
        console.log(newArr);
    }else{
        console.log('array less then '+position);
    }

})();