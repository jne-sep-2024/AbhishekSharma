class Car {

    constructor(model, engineType) {
        this.model = model;
        this.engineType = engineType;
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
myCar.startEngine();