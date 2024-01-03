let promise = new Promise((resolve, reject)=>{
    if(10%2 == 0){
        resolve();
    }
});


promise.then(()=>{
    console.log("EVEN");
})