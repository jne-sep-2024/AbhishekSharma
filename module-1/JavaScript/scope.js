var a = 11;

function scope() {

    let a = 10;
    console.log(a);
    //   let b = 11;

    function sum(a, b) {
        // let a = 100;
        console.log(a + b);
    }
    sum(10, 5);
}

scope();
console.log(a);
// sum(1);


//Block Scope
function hello() {
    let name = "Info";
    let card = true;

    if (card == true) {

        let name = `Card`;
        console.log("Hello:", name);
    }


}
hello();
