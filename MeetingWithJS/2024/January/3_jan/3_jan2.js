// let fruit = "apple";

// {
//   let fruit = "orange";
//   console.log(fruit);
// }

// console.log(fruit);

// var fruit = "apple";

// var fruit = "orange";
// console.log(fruit);

// console.log(fruit);

var k = 100;

function f1() {
  console.log(k);
  var fruit = "apple";
  {
    var fruit = "orange";
    console.log(fruit); // o  o   o     o     o
  }
  console.log(fruit); // a   o    o    o     o
}

// console.log(fruit);   // a   o     a    a     errrrr
console.log(k);
f1();



// f1(){   // parent
//     var a = 100;
//     f2(){     // son
//         var b = 200;
//         f3(){    // bacha
//             var c = 300;
//         }
//     }
// }
