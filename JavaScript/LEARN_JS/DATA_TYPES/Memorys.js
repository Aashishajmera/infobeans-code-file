// Stack(Primitive) ==> copy of variable,
// Heap(Non-primitive) ==> reference of variable 

// COPY VALUE
let myName = "Aashish";
let MyNickName = myName;

MyNickName =  "Aashu";
console.log(myName);
console.log(MyNickName);



// REFERENCE REAL VALUE
let userOne = {
    email: "abc@gmail.com"
}

let userTwo = userOne;
userTwo.email = "xyz@gmail.com"


console.log(userOne.email);
console.log(userTwo.email);