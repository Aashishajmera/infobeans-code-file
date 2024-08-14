(function (){
    let arr = [2,3, 9,4,56];
    let target = 9;
    let flag = false;
    let count = 0;

    for(let i = 0; i < arr.length; i++){
        if(arr[i] === target){
            flag = true;
            count++;
            break;
        }else{
            count++;
        }
    }

    if(flag){
        console.log('element is present', count);
    }else{
        console.log('element is not present', count);
    }


})();