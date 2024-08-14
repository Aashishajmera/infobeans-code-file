// function P1(){
//     for(let i = 1; i <= 5; i++){
//         let space = '';
//         for(let j = 1; j <= (5-i); j++){
//             space += ' ';
//         }
//         for(let j = 1; j <= i; j++){
//             space += j;
//         }
//         console.log(space);
//     }
// }



const user = {
    name: 'John Doe',
    age: 30,
    email: 'john.doe@example.com'
};

// Convert the object to a JSON string
const userString = JSON.stringify(user);
console.log(userString);


