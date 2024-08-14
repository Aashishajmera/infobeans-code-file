(function (){
    // let arr = [1,2,0,3,0,0,4,5,6];
    // let newArr = [] ;
    // let index = -1;
    // for(let i = 0; i < arr.length; i++){
    //    if(arr[i] !== 0){
    //     newArr[++index] = arr[i];
    //    }
    // }

    // for(let i = 0; i < arr.length; i++){
    //     if(arr[i] === 0){
    //         newArr[++index] = arr[i];
    //     }
    // }

    // console.log(newArr);


    let arr = [1,2,0,3,0,0,4,5,6];
    let index = -1;

    for(let i = 0; i < arr.length; i++){
        if(arr[i] !== 0){
            arr[++index] = arr[i];
        }
    }

    for(let i = index+1; i < arr.length; i++){
        arr[++index] = 0;
    }

    console.log(arr);
    
})();