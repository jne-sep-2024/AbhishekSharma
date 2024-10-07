const products = [
    { name: "Shirt", price: 20 },
    { name: "Shoes", price: 50 },
    { name: "Hat", price: 15 }
];

let sum = 0;

for (const element of products) {

    sum = sum + element.price;
}
console.log('For of:', sum);


//Using reduce method

let rMethod = products.reduce((item, currValue) => {
    return item + currValue.price;
}, 0);

console.log("Reduce Method:", rMethod);