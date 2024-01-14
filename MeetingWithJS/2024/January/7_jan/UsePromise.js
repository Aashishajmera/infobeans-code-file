const promise = new Promise((resolve, reject)=>{
    // 10/0 ? x("Odd") : y("Even");
    if(10%2==0){
        x("even")
    }else{
        y("odd")
    }
})

promise.then((result)=>{
    console.log(result);
}).catch((result)=>{
    console.log(result);
})