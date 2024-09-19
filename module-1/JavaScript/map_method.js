const { forEach } = require("async");

function square(element) {
    return Math.pow(element, 2);
}

const num = [1, 2, 3, 4, 5, 6];
const squares = num.map(square);

console.log("Square: " + squares);

//trying to get cube of nums


function cube(element) {
    return Math.pow(element, 3);
}

const printCube = num.map(cube);
console.log("Cube:", printCube);


//Uppercase
const student = ["Abhishek", "Rohit", "Santosh", "Shubham"];

function upperCase(element) {
    return element.toUpperCase();
}

const upperStudent = student.map(upperCase);
console.log(upperStudent);

//Format the dates
//date format:yyyy-d-m
const date = ["2024-1-5", "2021-21-8", "2025-16-7"];

const formmatedDate = date.map(formatDate);
console.log(formmatedDate);

function formatDate(element) {
    //spitting
    const arr = element.split("-");
    return `${arr[1]}/${arr[2]}/${arr[0]}`;
}


let abhi = { name: "abhishek" },
    roh = { name: "rohit" };

let userRoles = new Map();

//console.log(typeof userRoles);

userRoles.set(roh, "Admin");

for (const user of userRoles.keys()) {
    console.log(user.name);
}

const books = [
    { title: 'Book One', genre: 'Fiction', publish: 1981, edition: 2004 },
    { title: 'Book Two', genre: 'Non-Fiction', publish: 1992, edition: 2008 },
    { title: 'Book Three', genre: 'History', publish: 1999, edition: 2007 },
    { title: 'Book Four', genre: 'Non-Fiction', publish: 1989, edition: 2010 },
    { title: 'Book Five', genre: 'Science', publish: 2009, edition: 2014 },
    { title: 'Book Six', genre: 'Fiction', publish: 1987, edition: 2010 },
    { title: 'Book Seven', genre: 'History', publish: 1986, edition: 1996 },
    { title: 'Book Eight', genre: 'Science', publish: 2011, edition: 2016 },
    { title: 'Book Nine', genre: 'Non-Fiction', publish: 1981, edition: 1989 },
];

const fil = books.filter((item) => {
    return item.genre === 'History'
});
console.log(fil);


const pub = books.filter((item) => {
    return item.publish > 2000;
});

console.log(pub);


let myNum = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const myNums = myNum.map((item) => {
    return item + 10;
});

console.log(myNums);


//Calling map multiple times

const nNum = myNum.map((item) => { return item * 10 })
    .map((item) => { return item + 10 })
    .filter((item) => {
        return item > 40;
    });

console.log(nNum);

const accNums = [1, 2, 3];

const coco = accNums.reduce((accumilator, initialValue) => {

    console.log(`Accumilator: ${accumilator} and InitialValue: ${initialValue}`);

    return accumilator + initialValue
}, 0);

console.log(coco);



//Adding total fees of courses

const shopingCart = [

    {
        name: "Java",
        fees: 4599
    },
    {
        name: "JS",
        fees: 5000
    },
    {
        name: "Py",
        fees: 1299
    },
    {
        name: "DevOps",
        fees: 1534
    }

]

const totalPrice = shopingCart.reduce((acc, price) => {
    return acc + price.fees;
}, 0);

console.log("Total price: " + totalPrice);


//