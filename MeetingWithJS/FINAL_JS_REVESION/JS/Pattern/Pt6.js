(function (){
    let arr = ['I', 'N', 'D', 'I', 'A'];
    
    for(let i = 0; i < arr.length; i++){
        let str = '';
        for(let j = 0; j <= i; j++){
            str += arr[j]+' ';
        }
        console.log(str);
    }
})()