(function (){
    const n = 6;
    let strong = 0;
    for(let i = 1; i <= parseInt(n/2); i++){
        if(n%i==0){
            strong += i;
        }
    }
    if(strong == n){
        console.log('number is perfect');
    }else{
        console.log('number is not perfect');
    }
})()