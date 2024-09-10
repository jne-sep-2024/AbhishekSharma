//Arithmetic operator with objects
//By using valueOf() method

let energy = {

    valueOf() {

        return 100;
    },
};

let newEnergy = energy - 10;
console.log(newEnergy);

newEnergy = energy + 10;
console.log(newEnergy);

newEnergy = energy * 10;
console.log(newEnergy);

newEnergy = energy / 10;
console.log(newEnergy);

//By using toString() method

let solar = {

    toString() {
        return 50;
    },
};

let newSolar = solar + 10;
console.log(newSolar);

newSolar = solar - 10;
console.log(newSolar);

newSolar = solar * 10;
console.log(newSolar);

newSolar = solar / 10;
console.log(newSolar);

