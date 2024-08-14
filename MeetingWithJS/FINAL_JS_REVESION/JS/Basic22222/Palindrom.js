(function (){
    let n = 121, temp = n, rev = 0, lastDigit

    while(n != 0){
        lastDigit = n % 10;
        rev = (rev * 10) + lastDigit;
        n = parseInt(n/10);
    }

    if(temp === rev){
        console.log('number is palindrom....');
    }else{
        console.log('number is not palindrom....');
    }
})();