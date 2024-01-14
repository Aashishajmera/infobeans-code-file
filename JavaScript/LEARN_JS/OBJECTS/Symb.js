const mySym = Symbol('key1');

const jsUser = {
    name: 'Aashish',
    'full name': 'Aashish ajmera',
    age: 19,
    [mySym]: 'myKeyOne',
    location: 'khategaon',
    isLoggedIn: true,
    lastLoginDay: ['monday', 'saturday'], 
    
}


// get symbol
console.log(jsUser[mySym]);


// get name 1st way
console.log(jsUser.name);
// 2nd way
console.log(jsUser['name']);


// get full name only second way we can not get the value using 1st way
console.log(jsUser['full name']);