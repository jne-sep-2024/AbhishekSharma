let userName = "Abhishek Sharma            ";

//Creating function at object level 
Object.prototype.trueLength = function () {

    console.log(`${this}`);
    console.log(`True length is ${this.trim().length}`);
}

userName.trueLength();

//Here it is taking space value also
let valueOne = "absb       ";
console.log(valueOne.length);
valueOne.trueLength();


