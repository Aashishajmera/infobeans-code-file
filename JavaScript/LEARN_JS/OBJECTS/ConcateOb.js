const obj1 = {1: 'a', 2: 'b'}
const obj2 = {3: 'c', 4: 'd'}


console.log(obj1);

// concate the object
const obj3 = Object.assign({}, obj1, obj2)
console.log(obj3);

// Concate with the help of spread operator
const obj4 = {...obj1, ...obj2};
console.log(obj4);

