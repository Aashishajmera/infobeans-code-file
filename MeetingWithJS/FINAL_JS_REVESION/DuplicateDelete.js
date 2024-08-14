function removeduplicate(arr){
    let newLength = arr.length;
    for(let i = 0; i < arr.length; i++){
        for(let j = i + 1; j < arr.length; j++){
            if(arr[i] == arr[j]){
                for(let k = j; k < newLength; k++){
                    arr[k] = arr[k+1];
                }
                j--;
                newLength--;
            }
        }
    }

    let newArr = [];

    for(let i = 0; i < arr; i++){
        newArr[i] = arr[i];
    }

    return newArr;

}


const newArr = removeduplicate([2,3,4,2,3,5,6,7,4,9]);

console.log(newArr);