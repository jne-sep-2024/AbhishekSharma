//Assign

const { log } = require("async");

const person1 = {
    firstname: 'Abhishek',
    lastname: 'Sharma',
    age: 26,
    color: 'black'
}

// const person2 = {
//     firstname: 'Rohit',
//     lastname: 'Vishwakarma',
//     age: 26,
//     color: 'black'
// }


//Creating source object
let person2 = { firstname: 'Rohit' };


Object.assign(person1, person2);
let assign1 = Object.entries(person1);
console.log(assign1);

//Object.entries to convert object in map
const mMap = new Map(Object.entries(person1));
console.log(mMap);

//fromEntries()
//The fromEntries() method creates an object from a list of key/value pairs.
const fruits = [
    ["apples", 300],
    ["pears", 900],
    ["bananas", 500]
];

const fruit1 = Object.fromEntries(fruits);
console.log(fruit1.pears);

let val1 = Object.values(fruits);
console.log(val1);

let val2 = Object.keys(fruits);
console.log(val2);


Object.freeze(fruits);

console.log(fruits);


const obj = {
    name: 'Abhishek',
    age: 25
}
console.log('Before adding: ', obj);


obj.city = "Varanasi";
console.log('After adding city:', obj);

//delete an entity from a property
delete obj.city;
console.log("After deleting city: ", obj);


//To freeze the object
Object.freeze(obj);