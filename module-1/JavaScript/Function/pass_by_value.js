const { compose } = require("async");

//Pass-by-value of primitives values
function square(x) {
    return x * x;
};

let y = 10;
//let result = square(y);
console.log(square(y));

//Pass-by-value of reference values
let person = {
    name: "AA",
    age: 77
};

function increaseAge(obj) {
    obj.age += 1;
}

increaseAge(person);
console.log(person);

// Calculate the sum of n natural using recursion

function recurN(n) {

    if (n <= 1) {
        return n;
    }
    else {
        return n + recurN(n - 1);
    }
}

console.log(recurN(5));

//Default Parameter
function message(say = "Hi") {
    console.log(say);
}

message();
message("Hello");

//
function put(toy, toyList = []) {
    toyList.push[toy];
    return toyList;
}

console.log(put('Hello'));

//Print current day and time
function date(d = today()) {
    console.log(d);
}

function today() {
    return (new Date()).toLocaleDateString("en-US");
}
date();

//return value of a function as a default value for a parameter
let getRate = () => 0.1;

let getPrice = function (price, tax = price * getRate()) {
    return price + tax;
}

console.log(getPrice(100));



