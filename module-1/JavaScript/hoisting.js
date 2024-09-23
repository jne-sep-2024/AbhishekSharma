console.log(a);

count();

function count() {
    console.log("Hello");

}

var a = 10;
console.log(a);


//Hoisting doesnot work with arrow funciton
//this will give error
<<<<<<< HEAD

arrowFun();
var arrowFun = () => {
    console.log("Arrow Function");
};
=======
arrowFun();
var arrowFun = () => {
    console.log("Arrow Function");
};
>>>>>>> feature/day-8
