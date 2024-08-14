(function (){
    let arr = [1,2,4,57,4, 9,56];

    // first of all sort the array

    for(let i = 0; i < arr.length; i++){
        for(let j = 0; j < arr.length - i -1; j++){
            if(arr[j] > arr[j+1]){
                arr[j] = arr[j] + arr[j+1];
                arr[j+1] = arr[j] - arr[j+1];
                arr[j] = arr[j] - arr[j+1];
            }
        }
    }

    let low = 0, high = arr.length-1, mid = 0, target = 9, flag = false;

    for(let i = 0; i < arr.length; i++){
        mid = parseInt((low+high)/2);
        if(arr[mid] === target){
            flag = true;
            break;
        }else if(arr[mid] > target){
            high = mid - 1;
        }else{
            low = mid + 1;
        }
    }

    if(flag){
        console.log('element is present ', target);
    }else{
        console.log('element is not present ', target);
    }
})();