class Parent{
    f1(){
        console.log("I am f1 of parent");
    }
}

class Test1 extends Parent{
    f1(){
        console.log("I am f1 of child");
    }

}

const p = new Parent();
p.f1();
const t = new Test1();
t.f1();