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

const animals = [new Dog('Max'), new Cat('Coco')];

animals.forEach((animal) => {
    animal.speak();
});