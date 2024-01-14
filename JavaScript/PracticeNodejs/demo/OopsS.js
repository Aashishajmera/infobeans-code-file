// function f1() {
//   this.names = "Aashish";

//   this.m1 = function () {
//     console.log("Hii "+this.names);
//   };

//  this.f3 = function f3() {
//     console.log("I am f3");
//   }

// }

// let obj = new f1();
// obj.m1();
// obj.f3();
// // console.log(obj.names);


const first = (n)=>{
    console.log("Inside First : "+n);
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            reject(n+2);
        },1000);
    });
}

const second = (n)=>{
    console.log("Inside Second : "+n);
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve(n+2);
        },1500);
    });
}

const third = (n)=>{
    console.log("Inside Third : "+n);
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve(n+2);
        },1000);
    });
}

const fourth = (n)=>{
    console.log("Inside Fourth : "+n);
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve(n+2);
        },800);
    });
}

async function executeTask(){
   try{ 
    let a = await first(10);
    let b = await second(a);
    let c = await third(b);
    let d = await fourth(c);   
   }
   catch(err){
    console.log(err);
   }
//    finally{
//     console.log("Finally executed....");
//    }
}

executeTask();