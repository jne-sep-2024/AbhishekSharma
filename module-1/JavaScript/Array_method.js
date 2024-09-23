const items = [
    { name: "Rice", price: 100 },
    { name: "Wheat", price: 80 },
    { name: "Chips", price: 30 },
    { name: "Chocolate", price: 150 },
    { name: "Biscuit", price: 10 },
    { name: "Watch", price: 5000 },
    { name: "Bag", price: 1402 },
    { name: "Laptop", price: 69000 },
    { name: "RAM", price: 1300 },
    { name: "Job", price: 23000 }
];

//Filter-Method
console.log(items);

const filterMethod = items.filter((item) => {
    return item.price > 50;
});

console.log(filterMethod);

//Map

const mapMethod = items.map((item) => {
    return item.name;
});

console.log(mapMethod);

//Find method

const findMethod = items.find((item) => {
    return item.name == 'Rice';
});

console.log(findMethod);

//forEach

items.forEach((item) => {
    console.log(item.name);
});

//Some method
//if any number is greater than 10 it will return true

const someMethod = items.some((item) => {
    return item.price >= 10;
});

console.log(someMethod);

//Every Method
//In every method every items price much be grater than 11 else it will return false

const everyMethod = items.every((item) => {
    return item.price >= 11;
});

console.log("Every_Method: " + everyMethod);

//Reduce Method
//find total sum of price
const total = items.reduce((currentTotal, item) => {
    return item.price + currentTotal;
}, 0);

console.log(total);

//Include 
//it basically finds that this is in array or not


let arr = [1, 2, 3, 4, 5];

const includeMethod = arr.includes(4);
console.log("Includes Method: " + includeMethod);

//Reduce Method
const number = [1, 2, 3, 4, 5];
// let sum = 0;
// for (let i = 0; i < number.length; i++) {
//     sum = sum + number[i];
// }
// console.log(sum);

//Now using reduce method
let sumNumber = number.reduce((accumulator, currValue) => {
    return accumulator + currValue;

}, 0);

console.log(sumNumber);

