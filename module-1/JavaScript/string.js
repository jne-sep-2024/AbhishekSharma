const { compose } = require("async");

let str = "Abhishek ";
let str2 = "Sharma";

console.log(str + str2);

let mesage = `"I'm good". She said"`;
console.log(mesage);


let name = "Rohit";
let message1 = `Hi!, ${name}`;
console.log(message1);

//Length property
let practice = "I working as an intern in Thinkitive";
console.log("Length: ", practice.length);

//Assecing character
console.log(practice[0]);

//Concatinating string via + operator
let className = "btn";
className += " btn-btn";
className += " primary";

console.log(className);

//Converting value to string
//boolean value to string
let status = false;
let strS = status.toString();
console.log(strS);

//Converting String to boolean
//if boolran return false means string is an empty string
let boolean1 = Boolean(strS);
console.log(boolean1);

//Converting int to string and vice versa

let int3 = 1;
let str3 = int3.toString();
console.log(str3);

//let rInt1 = parseInt(str3);
let rInt = Number(str3);
console.log(rInt);

let nstr1 = "Hello";
let nInt1 = parseInt(nstr1);

if (isNaN(nInt1)) {
    console.log('Stirng cannot be converted int int');
}

else {
    console.log(nInt1);
}

//Compare String

let result = 'a' > 'A';
console.log(result);

//to get ascii value
let ascii = 'A'.charCodeAt(0);
console.log(ascii);

//Print ascii value of string
let sStr = "Hello";
for (let index = 0; index < sStr.length; index++) {

    console.log(`Ascii value of ${sStr[index]} is: ${sStr.charCodeAt(index)}`);
}

