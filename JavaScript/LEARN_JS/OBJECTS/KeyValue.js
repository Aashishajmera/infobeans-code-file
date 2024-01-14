const obj1 = {
    id: 101,
    name: 'Aashish',
    address: 'khategaon',
}

console.log(obj1);

console.log(Object.keys(obj1));  // RETURN KEY IN ARRAY
console.log(Object.values(obj1));  // RETURN KEY IN ARRAY
console.log(Object.entries(obj1));  // RETURN KEY AND VALUE IN ARRAY

// CHECK PROPERTIE we can say key
console.log(obj1.hasOwnProperty("id"));