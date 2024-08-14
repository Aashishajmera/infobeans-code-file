// (function (){
//     let max = -Infinity, sMax = -Infinity, min = Infinity, sMin = Infinity;
//     let arr = [1,4,2];
    
//     for(let value of arr){
//         if(value > max){
//             sMax = max;
//             max = value;
//         }
//         else if(sMax < value && max > value){
//             sMax = value;
//         }
//         if(value < min){
//             sMin = min;
//             min = value;
//         }
//         else if(min < value && sMin > value){
//             sMin = value;
//         }
//     }
//     console.log(max, sMax)
//     console.log(min, sMin)
// })();


(function (){
    let max = -Infinity, sMax = -Infinity, min = Infinity, sMin = Infinity;
    let arr = [2, 5,5];
    
    arr.forEach((element)=>{
        if(element > max){
            sMax = max;
            max = element;
        }else if(element < max && sMax < element){
            sMax = max;
        }
        if(element < min){
            sMin = min;
            min = element;
        }else if(element > min && sMin > element){
            sMin = element;
        }
    })

    console.log(max, sMax);
    console.log(min, sMin);
})();