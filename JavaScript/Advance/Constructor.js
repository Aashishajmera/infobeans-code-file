class Demo{
    // constructor(){
    //     console.log("i am parent constructor");
    // }

    // constructor(a,b){
    //     console.log("I AM SECOND PARENT");
    // }

    m1(){
        console.log("i am parent");
    }
}

class Real extends Demo{
    constructor(){
        console.log("i am child constructor");
        super();
    }

    m1(){
        console.log("i am child");
        super.m1();
    }


}

let obj = new Real();
obj.m1();