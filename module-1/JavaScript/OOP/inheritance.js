class Animal {
<<<<<<< HEAD

=======
>>>>>>> feature/day-8
    constructor(name) {
        this.name = name;
    }

    speak() {
        console.log(`${this.name} makes a sound`);

    }
}

class Dog extends Animal {
<<<<<<< HEAD

=======
>>>>>>> feature/day-8
    constructor(name, breed) {
        super(name);
        this.breed = breed;
    }

    speak() {
        console.log(`${this.name} barks`);

    }
}

const myDog = new Dog('Max', 'Bulldog');
myDog.speak();