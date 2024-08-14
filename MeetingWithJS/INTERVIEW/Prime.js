function checkPrime(n){
    if(n <= 1){
        return false;
    }

    for(let i = 2; i <= parseInt(n/2); i++){
        if(n%i==0){
            return true;
            break;
        }
    }
}

(function (){
    if(checkPrime(0)){
        console.log('prime');
    }else{
        console.log('not prime');
    }
})()