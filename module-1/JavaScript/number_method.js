//toString() method

let x = 10;
let str = x.toString();
console.log(str);

//toExponential() Method -- it gives round of number
let expos = 21.234;
let n = expos.toExponential();
console.log(n);

//toFixed() method
// Returns a number written with a number of decimals
let num = 9.3767653677;

console.log(num.toFixed(1));
console.log(num.toFixed(3));
console.log(num.toFixed(5)); 
console.log(num.toFixed(7));


//toPrecision() returns a string, with a number written with a specified length
let pres = 8.38264767622367;

console.log(pres.toPrecision(4));
console.log(pres.toPrecision(5));
console.log(pres.toPrecision(6));
console.log(pres.toPrecision(7));

//valueOf() returns a number as a number.
let val = 123;
console.log(val.valueOf());
console.log((4235).valueOf());
console.log((123+6566).valueOf());

//
