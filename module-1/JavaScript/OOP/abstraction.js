class Car {

    constructor(model, engineType) {
        this.model = model;
        this.engineType = engineType;
<<<<<<< HEAD
        console.log(this.model + this.engineType);

=======
>>>>>>> feature/day-8
    }

    startEngine() {

        console.log('Engine Started');
        this._fuelinjection();
        this._ignite();
    }

    //Private method
    _fuelinjection() {
        console.log('Fuel Injected');

    }

    _ignite() {
        console.log('Ignition Started');

    }
}

const myCar = new Car('Toyota', 'V8');
<<<<<<< HEAD
myCar.startEngine();

const myCar1 = new Car('Thar', 'Q3');
myCar1.startEngine();
=======
myCar.startEngine();
>>>>>>> feature/day-8
