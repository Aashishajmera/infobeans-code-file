// let {EventEmitter} from 'events';
import { EventEmitter } from 'events';



let myEmiter = new EventEmitter();


myEmiter.on('12pm', ()=>{
    console.log('Hii, good morning guys');
})

myEmiter.on('1pm', ()=>{
    console.log("Hii, good afternoon guys");
})

myEmiter.once('4pm', ()=>{
    console.log("Hii, good evening guys");
})


myEmiter.emit('12pm');
myEmiter.emit('12pm');
myEmiter.emit('1pm');
myEmiter.emit('1pm');
myEmiter.emit('4pm');
myEmiter.emit('4pm');
