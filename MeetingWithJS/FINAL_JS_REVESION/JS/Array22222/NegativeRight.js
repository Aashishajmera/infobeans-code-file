const myFun = () => {
    let arr = [1,2,3,-4,4,-99,5,6,-88, -87];

    let newArr = [];
    let index = -1;

    for(let i = 0; i < arr.length; i++){
        if(arr[i] > 0){
            // newArr.push(arr[i]);
            newArr[++index] = arr[i];
        }
    }

    for(let i = 0; i < arr.length; i++){
        if(arr[i] < 0){
            // newArr.push(arr[i]);
            newArr[++index] = arr[i];
        }
    }

    console.log(newArr);
};

myFun();