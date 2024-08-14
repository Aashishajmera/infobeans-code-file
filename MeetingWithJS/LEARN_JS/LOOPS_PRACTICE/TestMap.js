// const kvArray = [
//   { key: 11, value: 10 },
//   { key: 22, value: 20 },
//   { key: 33, value: 30 },
// ];

// const reformattedArray = kvArray.map((value, index)=>{
//     // console.log([index].key);
//     return kvArray[index].key;
// });

// console.log(reformattedArray); // [{ 1: 10 }, { 2: 20 }, { 3: 30 }]



// const obj = [{name: 'Aashish', surname: "ajmera"}, {name: 'deepak', surname: 'ajmera'}]

// // console.log(obj[0].name);

// obj.map((value, index)=>{
//     console.log(obj[index].name, '   ', obj[index].surname);
// })

//   console.log(kvArray);

// const obj = {
//     arr: [1,2,3],
//     arr2: [4,5,6]
// }

// Object.keys(obj).map((value)=>{
//     console.log(value);
// })

// const obj = {name: 'aashish', name: 'rahul', 1: 'aashish', null: 'rahul', undefined: 'raj'}
// console.log(obj);


function Person(first, last, age, eyecolor) {
    this.firstName = first;
    this.lastName = last;
    this.age = age;
    this.eyeColor = eyecolor;
  }
  
  console.log(Person.prototype.firstName);