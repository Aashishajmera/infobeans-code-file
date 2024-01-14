let myDate = new Date();
console.log(myDate);
console.log(myDate.toString());
console.log(myDate.toDateString());
console.log(myDate.toLocaleString());
console.log(typeof(myDate));

console.log('========');     //year month date  month 0 se start hote hai
let myCreateDate = new Date(2023, 3, 27)
console.log(myCreateDate.toDateString());

let myCreateDate2 = new Date(2023, 3, 27, 5, 3);
console.log(myCreateDate2.toLocaleString());

let myCreateDate3 = new Date('01-22-2024');
console.log(myCreateDate3.toLocaleDateString());


let newDate = new Date();
console.log(newDate.getMonth());
console.log(newDate.getDay());
console.log(newDate.toLocaleString('default',{
    weekday: "long",
    weekday: "narrow"
}));