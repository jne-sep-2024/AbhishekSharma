let remainder = 5 % -2;
console.log(remainder);

remainder = 5 % 2;
console.log(remainder);

//if the dividend in negative output will be nagative

remainder = -5 % 2;
console.log(remainder);

remainder = -5 % -2;
console.log(remainder);

// if either divided or divisor is not a number

remainder = '10' % 2;
console.log(remainder);

remainder = '10' % 3;
console.log(remainder);

//Using remainder check number is even or odd

let num = 13;
if (num % 2 == 0) {
    console.log("Even");
}
else {
    console.log("Odd");
}

//or
const isOdd = (num) => num % 2 !== 0;
console.log(isOdd(10));
console.log(isOdd(13))


//Modulo
const mod = (dividend, divisor) => ((dividend % divisor) + divisor) % dividend;

console.log("Remiander:", 5 % 2);
console.log("Mod", mod(5, 2));

