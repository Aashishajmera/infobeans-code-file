(function (){
    let arr = [1,2,3,4,5];

    let sum = 0;

    arr.forEach((element)=>{
        sum += element;
    })

    console.log('array element sum is: '+sum);
})();