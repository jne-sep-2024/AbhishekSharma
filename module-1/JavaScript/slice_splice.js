//Slice : it create new array

const color = ['red', 'green', 'blue', 'black'];

const nColor = color.slice(1, 3);
console.log('N Colour:', nColor);


color.splice(3, 3);
console.log("Splice:", color);
