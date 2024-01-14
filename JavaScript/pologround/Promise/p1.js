let promise = new Promise((resolve, reject)=>{
    if(10%2 == 0){
        resolve();
        console.log("askdlfj");
    }else{
        reject();
    }
});

promise.then(()=>{
    console.log("EVEN"); b
}).catch(()=>{
    console.log("ODD");
})

// function m1(){
//     console.log(" i m m1");
// }


// bsdk();