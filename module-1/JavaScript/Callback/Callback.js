function hello() {
    console.log("Hello");
}
//Here initilise class name, time is mili-seccond
//setTimeout(hello, 1000);

//other ways
//like Lambda Expression

//Asyncronous
console.log("One");
console.log("Two");
//setTimeout(() => { console.log("Hello Again") }, 4000);
console.log("Three");
console.log("Four");

//Callback

function sum(a, b) {
    console.log(a + b);
}

function calculator(a, b, sumCallback) {
    console.log(a + b);
}

calculator(1, 2, sum);

//Nested loop

for (let i = 0; i < 5; i++) {

    let str = "";
    for (let j = 0; j < 5; j++) {
        // console.log(j);//value will print in next line
        str = str + j;
    }
    console.log(i + " " + str);
}

//nested if-else
let age = 20;

if (age >= 18) {
    if (age >= 60) {
        console.log("Senior");
    }
    else { console.log("Middle"); }
}
else {
    console.log("Child");
}

//Callback_Hell

function getData(getId) {
    setTimeout(() => { console.log("data" + getId), 4000 })
}

getData(1);
getData(2);
getData(3);

//Using nested approach in which each data will return after 2s each