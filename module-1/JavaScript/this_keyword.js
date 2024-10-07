const { log } = require("async");

function user() {
    return {

        firstname: "Abhishek",
        lastname: 'Sharma',

        fullname: function () {
            return this.firstname + " " + this.lastname;
        }
    };
}

function user2() {
    return {
        firstname: 'Rohit',
        lastname: 'Vishwakarma'
    };
}

// const obj1 = user();

// const obj2 = obj1.fullname.bind(user2());
// console.log(obj2());

const obj1 = user().fullname.bind(user2());
console.log(obj1());



const person1 = {

    firstname: "Abhishek",
    lastname: 'Sharma',

    fullname: function () {
        return this.firstname + " " + this.lastname;
    }
}

const person2 = {
    firstname: 'Rohit',
    lastname: 'Vishwakarma'
}

const obj = person1.fullname.bind(person2);
console.log(obj());


//Call Method
// call() method allows an object to use the method (function) of another object.
function sayHello() {
    return 'Hello' + this.name;
}

var obj3 = {
    name: 'Abhishek'
}

let callMethod = sayHello.call(obj3);
console.log(callMethod);

//Call method  ---------------------- 
//Apply method
//call() method takes arguments separately whereas, apply() method takes arguments as an array.

function div(message) {
    return this.name + " is " + message;
}

var obj4 = {
    name: 'Sharma'
}

let applyMethod = div.apply(obj4, ["awesome"]);
console.log(applyMethod);
