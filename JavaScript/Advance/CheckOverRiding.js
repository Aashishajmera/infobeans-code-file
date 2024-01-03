class Demo{
    m1(){
        console.log("i am parent");
    }
}

class Real extends Demo{
    m1(){
        console.log("i am child");
        super.m1();
    }


}

let obj = new Real();
obj.m1();