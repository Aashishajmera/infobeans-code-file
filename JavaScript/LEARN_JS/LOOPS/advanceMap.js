const arr = [
  { name: "Raj", id: 101 },
  { name: "Sandeep", id: 102 },
];

console.log("=================FOR=================");
// PRINT USIGN FOR LOOP
for (let i = 0; i < arr.length; i++) {
  console.log(arr[i]);
}
console.log("=================FOR-EACH=================");

// PRINT USING FOREACH LOOP
arr.forEach((element) => {
  console.log(element);
});
console.log("=================MAP=================");

// PRINT USING MAP
arr.map((value, index) => {
  console.log(value, index);
});
console.log("=================FINISH=================");
