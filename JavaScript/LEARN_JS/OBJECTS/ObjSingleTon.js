const tinderUser = new Object();

tinderUser.id = 101;
tinderUser.name = "Aashish";
tinderUser.isLoggedIn = true;

// console.log(tinderUser);


const regularUser = {
    email: 'abc@gmail.com',
    fullName: {
        userFullName: {
            firstName: 'hitesh',
            lastName: 'choudhary'
        }
    }
}

console.log(regularUser.fullName);
console.log(regularUser.fullName.userFullName);
console.log(regularUser.fullName?.userFullName); // if fullname is not exist so ?