(function (){
    let n = 1634;
    let temp = n, count = 0, lastDigit, fact = 1, arm =0;
    // for count the digit
    while(n != 0){
        n = parseInt(n/10);
        count++;
    }
    n = temp;
    while(n != 0){
        lastDigit = n % 10;
        for(let i = 1; i <= count; i++){
            fact *= lastDigit;
        }
        arm += fact;
        fact = 1;
        n = parseInt(n/10);
    }
    
    if(arm == temp){
        console.log('Number is armstrong...')
    }else{
        console.log('Number is not armstrong...')
    }
})();