// FALSE
/*
0, "", null, undefined, false, NaN, 
*/

// TRUE
/*
    "AKDFJ", {} , [] , "false", "0", 88, true, Infinity
*/

// [] ? console.log("true") : console.log("false");

if(on(BigInt)){
    console.log("true");
}else{
    console.log("false");
}