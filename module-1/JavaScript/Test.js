// Whitespace
let formatted = true;

if (formatted) {
    console.log("Hello");
}

//Print statement
let message1 = "Printing Statement";
console.log(message1);

//

let num = 0o71;
console.log(num);

//Boolean datatype
//if string is non-empty -> true
//if string is empty -> false
let error = "Error";
let hasError = Boolean(error);
console.log(hasError);

//  implicitly call Boolean() function

let error1 = "An error occured";
if (error1) {
    console.log(error1);
}

//JavaScript String

let first_name = "Abhishek";
let last_name = "Sharma";
console.log(first_name + " " + last_name);

//Using $

let name = "Abhishek Sharma";
let message = `I'm ${name}`;
console.log(message);

//use of parseInt

let n = parseInt('111', 2);
console.log("Binary: " + n);
//Using split method

let data = "Line 1\r\nLine 2\r\nLine 3";
let lines = data.split("\r\n");
console.log(lines);

//backslash
let bs = 'I\'m Abhishek';
let nbs = "I'm Abhishek";
console.log(bs);
console.log(nbs);

//concatinating using +

let name2 = "Abhishek";
let fname = "Hello " + name2;
console.log(fname);

//Assemble string piece by piece

let className = 'btn \r';
className += 'btn-primary \r';
className += 'btn-btn';

console.log(className);

//Converting value to string

let status = false;
let str = status.toString();
let back = Boolean(str);

console.log("Value of str: " + str);
console.log("Status: " + back);

//comparison of string using ascii value

let check = 'a' < 'B';
console.log("Result: " + check);

