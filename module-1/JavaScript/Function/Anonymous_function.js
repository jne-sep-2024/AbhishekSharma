//Anonymous Function
let res = function () {
    console.log("Anonymous Function");
};

res();

//Using anonymous functions as arguments
setTimeout(function () {
    console.log("After 1s:");
}, 1000);

(function () {
    console.log('IIFE');
})();

//Pass argument in anonymous function

let person = {
    name: "Abhishek",
    age: 26
};

(function () {
    console.log(person.name + person.age);
})();

