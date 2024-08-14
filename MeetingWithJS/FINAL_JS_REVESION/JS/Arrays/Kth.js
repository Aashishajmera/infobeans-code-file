(function (){
    let arr = [1,2,3,4,5,6,7,8];
    let k = 4, smallest, largest; l = 3;
    if(k <= arr.length){
         smallest = arr[k-1];
         largest = arr[arr.length-3];
    }
    console.log(smallest);
    console.log(largest);
 })()