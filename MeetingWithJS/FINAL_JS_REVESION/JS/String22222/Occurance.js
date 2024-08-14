(function (){
    let str = 'satish';
    let arr = [];


    for(let i = 0; i < str.length; i++){
        arr[i] = str.charAt(i);
    }

    for(let i = 0; i < str.length; i++){
        let count = 0;
        for(let j = 0; j < str.length; j++){
            if(arr[i] === arr[j]){
                if(j < i){
                    count = 0;
                    break;
                }else if(j >= i){
                    count++;
                }
            }
        }
        if(count != 0){
            console.log(arr[i], ' present in ', count ,' time');
        }
    }
})();