import path from 'path';

console.log(path.delimiter);

// return directory name
console.log(path.dirname('PracticeNodejs/pathmodule/p1.js'));

// Return the file name
console.log(path.basename('PracticeNodejs/pathmodule/p1.js'));

// return extension 
console.log(path.extname('PracticeNodejs/pathmodule/p1.js'));

// return path absolute or not
console.log(path.isAbsolute('/PracticeNodejs/pathmodule/p1.js'));

