const myFun = function (a, b, calllback){
    let result = a + b;
    calllback(result)
}

const callback = (sum)=>{
    console.log(sum);
    console.log('I am callack');
};

(function (){
    const st = prompt("enter number")
    console.log(typeof st);
    myFun(10, 20, callback)
})()