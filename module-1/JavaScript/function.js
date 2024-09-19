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
    { name: 'Sony Xperia', price: 700 }
];

console.table(products);

console.log("Product sorted by price");

products.sort(compareBy('price'));

console.table(products);
