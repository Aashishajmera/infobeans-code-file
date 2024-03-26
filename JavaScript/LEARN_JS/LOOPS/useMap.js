const arr = [1, 2, 3, 4, 5];

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
arr.map((element) => {
  console.log(element);
});
console.log("=================FINISH=================");
