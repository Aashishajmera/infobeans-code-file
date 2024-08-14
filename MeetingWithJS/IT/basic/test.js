



function f1 (){
    var t = "temp" ;
    {
        let s = 22;
        s = 44;
        console.log(s);
    }
    console.log(s);
}

f1()

// console.log(t);