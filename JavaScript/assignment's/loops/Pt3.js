var k = 0;
for(var r = 1; r <= 6; r++){
    k = (r%2 != 0) ? k += 2 : k = k;
    for(var c = 1; c < k; c++){
        console.log("*");
    }
    console.log(object);
}