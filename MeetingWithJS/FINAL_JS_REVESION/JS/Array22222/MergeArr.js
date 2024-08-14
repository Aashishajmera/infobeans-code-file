const merge = function(){
    let arr1 = [1,2,3,4,5];
    let arr2 = [6,7,8,9,10];

    let mergeArr = new Array(arr1.length + arr2.length);
    let index = -1;

    for(let i = 0; i < arr1.length; i++){
        mergeArr[++index] = arr1[i]; 
    }
    for(let i = 0; i < arr2.length; i++){
        mergeArr[++index] = arr2[i]; 
    }

    console.log('merge array is: ', mergeArr);
};


merge();