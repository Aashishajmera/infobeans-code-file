const jsUser = {
    name: 'Aashish',
    'full name': 'Aashish ajmera',
    age: 19,
    location: 'khategaon',
    isLoggedIn: true,
    lastLoginDay: ['monday', 'saturday'], 
    
}


// default object
console.log(jsUser);


// change name usign old way 
// jsUser.name = "Aashu"
// console.log(jsUser);

// change name using new way
// jsUser['name'] = "Aashu"
// console.log(jsUser);


// lock the object
Object.freeze(jsUser);
// I WANT TO CHANGE THE NAME 
jsUser.name = 'Aashu'   // value not change because object freeze
console.log(jsUser);

