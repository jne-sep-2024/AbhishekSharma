class Person {
    constructor(name, age) {
        this.name = name;
        this._age = age; //covention for private property
    }

    getAge() {
        return this._age;
    }

    setAge(newAge) {

        if (newAge > 0) {
            this._age = newAge;
        }
        else {
            console.log("Invalid");

        }
    }
}

const person1 = new Person('Abhishek', 25);
console.log(person1);

console.log(person1.getAge());

person1.setAge(45);
console.log(person1);

