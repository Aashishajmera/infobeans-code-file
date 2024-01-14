const jsUser = {
    id: 101,
    name: 'Aashish'
}

jsUser.greeting = ()=>{
    console.log("Hello js user");
}

jsUser.greetingTwo = ()=>{
    console.log(`Hello js user, ${this.name}`);
}

console.log(jsUser);
console.log(jsUser.greeting());
console.log(jsUser.greetingTwo());