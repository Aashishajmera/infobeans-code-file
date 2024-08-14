(function (){
    let a = 0, b = 1, sum = 0;
    for(let i = 1; i <= 5; i++){
        a = b;
        b = sum;
        console.log(sum);
        sum = a +b;
    }
})();