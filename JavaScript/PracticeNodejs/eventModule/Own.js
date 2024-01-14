import event from 'events';

const EventEmitter = new event.EventEmitter();

// it's my event
EventEmitter.on("first",()=>{
    console.log("I am first");
})

EventEmitter.emit('first');