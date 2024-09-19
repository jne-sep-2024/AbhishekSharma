const myArray = [1, 2, 3, 4, 5, 6, 3, 1];

const mySet = new Set(myArray);

console.log(myArray);
console.log(mySet);

//Getting output in form of array
const mySet1 = [...mySet];
console.log(mySet1);

//Adding element in array
mySet.add(21);
console.log(mySet);

//Deleting an element from an array
mySet.delete(21);
console.log(mySet);

//Has check that element is in array or not
console.log(mySet.has(21));

//Get size of an element
console.log(mySet.size);

