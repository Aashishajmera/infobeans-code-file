const findDuplicate = (arr) => {
    let str = ''
    for(let i = 0; i < arr.length; i++){
        let count = 0;
       for(let j = 0; j < arr.length; j++){
        if(arr[i] === arr[j]){
            if(j < i){
                count = 0;
                break;
            }else{
                count++;
            }
        }
       }
       if(count > 1){
        str += count + arr[i];
       }
    }
    return str;
}


const str = findDuplicate(['a', 'b', 'a', 'c', 'a', 'v', 'b']);

console.log(str);