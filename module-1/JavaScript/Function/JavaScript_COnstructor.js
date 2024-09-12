function person(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;

    this.getFullName = function () {
        return this.firstName + this.lastName;
    }
}

let person1 = new person("Abhishek ", "Sharma");
let person2 = new person("Rohit ", "Vishwakarma");


console.log(person1.getFullName());
console.log(person2.getFullName());

//Returning from constructor functions

function cons1() {

    this.name = "Coco";

    return {
        name: "Default Value"
    };
}

let obj = new cons1();
console.log(obj.name);

