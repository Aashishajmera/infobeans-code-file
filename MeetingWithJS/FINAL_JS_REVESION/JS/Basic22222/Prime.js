function checkPrime(n){
    if(n <= 1){
        return false;
    }

    for(let i = 2; i <= parseInt(n/2); i++){
        if(n % i == 0){
            return false;
        }
    }

    return true;
}

(function (){
  let flag =  checkPrime(11);
  if(flag){
    console.log('Number is prime: ');
  }else{
    console.log("Number is not prime: ");
  }
})();