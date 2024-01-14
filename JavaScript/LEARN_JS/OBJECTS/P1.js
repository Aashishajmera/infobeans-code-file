const jsUser = {
    name: 'Aashish',
    'full name': 'Aashish ajmera',
    age: 19,
    location: 'khategaon',
    isLoggedIn: true,
    lastLoginDay: ['monday', 'saturday'], 
    
}

// get name 1st way
console.log(jsUser.name);
// 2nd way
console.log(jsUser['name']);


// get full name only second way we can not get the value using 1st way
console.log(jsUser['full name']);
