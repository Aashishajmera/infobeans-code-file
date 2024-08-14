(function (){
    let arr = [1,2,3,4,5,6];
    let newArr = [];
    
    let size = arr.length;
    let index = 3;
    if(index <= size){
        let value = 44;
        for(let i = 0; i < index; i++){
            newArr[i] = arr[i];
        }
        newArr[index] = value;
        for(let i = index; i < size; i++){
            newArr[i+1] = arr[i];
        }
    }
    for(let i of newArr){
        console.log(i)
    }
})()