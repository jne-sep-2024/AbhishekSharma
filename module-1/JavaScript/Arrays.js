let mountains = new Array('Mount Everest', 'Nanda Devi', 'Kamet');
console.log(mountains);

//Getting the array size
console.log("Length of Mountains: " + mountains.length)

//Adding an element at the end of element
mountains.push("K2");
console.log(mountains);

//Adding an element at the begining of an element
mountains.unshift("Nun");
console.log(mountains);

//Removing an element from end of array
console.log(mountains);
const last_ele = mountains.pop();
console.log(last_ele);
console.log(mountains);

const first_ele = mountains.shift();
console.log(mountains);

//findind and index of an element

let index = mountains.indexOf("Kamet");
console.log(index);

//Check the value is in array
console.log(Array.isArray(mountains));

//Add element is any index

function insertElement() {

    let arr = [1, 2, 3, 4, 5];
    let index = 2;
    let element = 8;

    arr.splice(index, 0, element)
    console.log(arr);
}
insertElement();

//Removing an element form a specific location 

function removeFunction() {
    let arr = [1, 2, 3, 4, 5];
    let index = 2;

    arr.splice(2, 1);
    console.log(arr);
}
removeFunction();