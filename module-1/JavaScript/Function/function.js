function sum(a, b) {
    console.log("Sum: " + (a + b));
}

sum(1, 2);

let add = sum;

function average(a, b, avg) {
    avg = (a + b) / 2;
    console.log("Average:", avg);
}

average(10, 20, add);


//Uses of compareBy function

let products = [
    { name: 'iPhone', price: 900 },
    { name: 'Samsung Galaxy', price: 850 },
    { name: "MacBook", price: 1500 },
    { name: 'Sony Xperia', price: 700 }
];

console.table(products);

console.log("Product sorted by price");


//Creating function for compareBy

function compareBy(propertyName) {


    return function (a, b) {
        let x = a[propertyName];
        let y = b[propertyName];

        if (x > y) {
            return -1;
        }
        else if (y > x) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
console.log("USing compareBy() method");
products.sort(compareBy('name'));

console.table(products);


//Creating function for addition
function addition(a, b) {
    return a + b;
}

let result = addition(1, 2);
console.log(result);


//Creating fuyunction for Multiplication
function mul() {
    let val = 1;

    for (let i = 0; i < arguments.length; i++) {

        val = val * arguments[i];
    }
    return val;

}

let ans = mul(1, 2, 3, 4, 5);
console.log(ans);

//Unit convert

function inTocn(length) {
    return length * 0.393701;
}

function cmToin(length) {
    return length / 0.393701;

}

function convert(fn, length) {
    return fn(length);
}

let rrr = convert(cmToin, 100);
console.log(rrr);

let nrr = convert(inTocn, rrr);
console.log(nrr);

