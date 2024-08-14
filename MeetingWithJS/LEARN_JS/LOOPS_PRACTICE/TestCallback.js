// function demo(callback, a,b) {
//     if(true){
//         callback();
//         console.log('first');
//     }
    
// }

// demo(()=>{
//     console.log('Hii i am callback');
// },10,20)

function* f1(){
    console.log("i am f1");
    yield 2;
    yield 3;
}
console.log(f1().next());