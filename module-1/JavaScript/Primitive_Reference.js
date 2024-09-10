//Dynamic property
//Created a refrence variable
//in which if we change the value in property other will also change
let person = {
    name: "John",
    age: 25
};

let member = person;
member.name = "John Doe";

console.log(person);
console.log(member);

//Add phone number
person.number = '01234456';

console.log(person);

delete person.age;

console.log(person);

//Copying value
//here if we change the value of one variable it will not affect the another variable
let age = 25;
let newAge = age;

age = age + 1;
console.log(age, newAge);

//
