function one() {
    console.log("One");
    two();
}

function two() {
    console.log("Two");
    three();
}

function three() {
    console.log("Three");

}

console.log("1st Method");
one();

console.log("\n2nd method");
two();

console.log("\n3rd Method");
three();
