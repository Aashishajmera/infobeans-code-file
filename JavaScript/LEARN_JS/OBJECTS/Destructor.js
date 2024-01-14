const course = {
    coursename: 'js',
    price: 999
}

// const {coursename} = course;
// console.log(coursename);

const {coursename: name} = course;
console.log(name);