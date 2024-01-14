// DEFICALT

// import MyEvent from "events";

// class MyEmmit extends MyEvent {}

// const myEmmitObj = new MyEmmit();

// myEmmitObj.on("firstFun", () => {
//   console.log("I am first fun.....");
// });

// myEmmitObj.emit("firstFun");

// MEDIUM
// import event from 'events';
// const MyEvent = new event.EventEmitter();
// MyEvent.on('sayMyName', ()=>{
//     console.log("I am event: ");
// })
// MyEvent.emit('sayMyName')



// SIMPLE
import MyEmitter from "events";

const event = new MyEmitter();

// create a event emiter
event.on("sayHello", () => {   // IN CASE OF ON WE CAN CALL THE MULTIPULE TIME BUT IN CASE OF ONCE WE CAN'T
  console.log("Hello....");
});

// event.on("say", () => {
//     console.log("Hello....");
//   });

// call the sayHello emiter
event.emit("sayHello");
event.emit("sayHello")
