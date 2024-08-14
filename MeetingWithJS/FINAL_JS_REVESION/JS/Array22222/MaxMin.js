// (function (){
//     let max = -Infinity, min = Infinity;
//     let arr = [1,2,34,5,6,7,9];
    
//     for(let value of arr){
//         if(value > max){
//             max = value;
//         }
//         if(value < min){
//             min = value;
//         }
//     }
//     console.log(max, min)
// })();

(function (){
    let max = -Infinity, min = Infinity;
    let arr = [3,4,5,6,7,8];
    arr.forEach((element)=>{
        if(element > max){
            max = element;
        }
         if(element < min){
            min = element;
        }
    })
    console.log(max+" "+ min);
})();