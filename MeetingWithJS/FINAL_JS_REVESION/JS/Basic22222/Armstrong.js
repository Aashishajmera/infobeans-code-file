(function (){
    let n = 153, temp = n, lastDigit, count = 0, mul = 1, arm = 0;

    while(n != 0){
        lastDigit = n % 10;
        count++;
        n = parseInt(n/10);
    }

    n = temp;

    while(n != 0){
        lastDigit = n % 10;
        mul = 1;
        for(let i = 1; i <= count; i++){
            mul *= lastDigit;
        }
        arm += mul;
        n = parseInt(n/10);
    }

    if(temp === arm){
        console.log('Number is armstrong....');
    }else{
        console.log('Number is not armstrong....', arm, temp);
    }

})();