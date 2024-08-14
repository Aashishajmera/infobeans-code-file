(function () {
  let arr = [
    { name: "aashish", surname: "ajmera" },
    { name: "deepak", surname: "ajmera" },
    {name: 'mohan', surname: 'oon'}
];

let newArr = [];
let index = -1;
    for(let i = 0; i < arr.length; i++){
        if(arr[i].surname === 'ajmera'){
            newArr[++index] = arr[i]; 
            // console.log(arr[i]);
        }
    }

    console.log(newArr);
})();
