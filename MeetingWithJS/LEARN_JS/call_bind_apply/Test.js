const obj = { x: 10,

    getX:  function () {
        return this.x;
      }
      
};

function getY() {
  return this.x;
}

const boundGetX = getY.bind(obj); // Create a new function with 'this' bound to 'obj'

console.log(boundGetX()); // Output: 10


// const obj = { 
    
//     name: 'hello',

//     getX:  function (...a) {
//         console.log(a);
//         return this.name;
//       }
// };

// const obj2 = { 
    
//     name: 'hiii',
    
// };

// // const boundGetX = obj.getX.bind(obj2); // Create a new function with 'this' bound to 'obj'
// const boundGetX = obj.getX.bind(obj2, [2,3,45]); // Create a new function with 'this' bound to 'obj'

// console.log(boundGetX()); // Output: 10

// const obj = { 
    
//     name: 'hello',

//     getX:  function (...a) {
//         console.log(a);
//         return this.name;
//       }
// };

// const obj2 = { 
    
//     name: 'hiii',
    
// };

// // const boundGetX = obj.getX.bind(obj2); // Create a new function with 'this' bound to 'obj'
// const boundGetX = obj.getX.call(obj2,[2,2,4,5,6]); // Create a new function with 'this' bound to 'obj'

// console.log(boundGetX); // Output: 10



// const obj = { 
    
//     name: 'hello',

//     getX:  function (...a) {
//         console.log(a);
//         return this.name;
//       }
// };

// const obj2 = { 
    
//     name: 'hiii',
    
// };

// // const boundGetX = obj.getX.bind(obj2); // Create a new function with 'this' bound to 'obj'
// const boundGetX = obj.getX.apply(obj2,1,2,3,45); // Create a new function with 'this' bound to 'obj'

// console.log(boundGetX); // Output: 10
