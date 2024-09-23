class Animal {
    constructor(name) {
        this.name = name;
    }

    speak() {
        console.log(`${this.name} makes a sound`);

    }
}

class Dog extends Animal {
    speak() {
        console.log(`${this.name} barks`);

    }
}

class Cat extends Animal {
    speak() {
        console.log(`${this.name} meows`);

    }
}

<<<<<<< HEAD
const animals = [new Dog('Max'), new Cat('Kitty')];
=======
const animals = [new Dog('Max'), new Cat('Coco')];
>>>>>>> feature/day-8

animals.forEach((animal) => {
    animal.speak();
});