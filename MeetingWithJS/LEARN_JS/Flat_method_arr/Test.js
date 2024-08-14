const twoDArray = [[1, 2], [3, 4], [5, 6]];
const oneDArray = twoDArray.flat();
console.log(oneDArray); // Output: [1, 2, 3, 4, 5, 6]


const twoDArray = [[1, 2], [3, 4], [5, 6]];
const oneDArray = [].concat(...twoDArray);
console.log(oneDArray); // Output: [1, 2, 3, 4, 5, 6]
