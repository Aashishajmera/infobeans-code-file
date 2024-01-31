// const EventEmitter = require('events');
import EventEmitter from 'events';

// Create a custom class that extends EventEmitter
class MyEmitter extends EventEmitter {}

// Instantiate your custom EventEmitter
const myEmitter = new MyEmitter();

// Define a custom event handler
const myEventHandler = (data) => {
  console.log('Custom event occurred with data:', data);
};

// Attach the event handler to the custom event
myEmitter.on('customEvent', myEventHandler);

// Emit the custom event with some data
myEmitter.emit('customEvent', { message: 'Hello, EventEmitter!' });
myEmitter.emit('customEvent', { message: 'Hello, EventEmitter!' });

