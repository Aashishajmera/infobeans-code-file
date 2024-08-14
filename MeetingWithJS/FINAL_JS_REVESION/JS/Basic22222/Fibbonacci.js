(function (){
    function printFibonacci(n){
        let a = 1, b = 2, c = 1;
        for(let i = 1; i <= n; i++){
            a = b;
            b = c;
            console.log(c);
            c = a * b;
        }
    }
    printFibonacci(10);
})();