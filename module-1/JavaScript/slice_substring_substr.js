const { log } = require("async");

let text = 'Apple, Banana, Kiwi';

//slice (it also take negative input)

let vSlice = text.slice(-12, -6);
console.log(vSlice);

//substring (it doesnot take -negattive value...if given it is considered as 0)
let vSubstring = text.substring(4, -12);
console.log(vSubstring);


//Substr method

let vSubstr = text.substr(2, 8);
console.log(vSubstr);

let vSubstr1 = text.substr(-6);
console.log(vSubstr1);



//trim()

let text1 = '                Abhishek             ';
let trim1 = text1.trim();
console.log(trim1);

let trim2 = text1.trimStart();
console.log(trim2);

let trim3 = text1.trimEnd();
console.log(trim3);

//String Padding

let pNum = "55";

let pad1 = pNum.padStart(4, '0');
console.log(pad1); //0055

let pad2 = pNum.padEnd(5, '1');
console.log(pad2); //55111

//String repeat()

let text3 = "Hello World ";
let repeat1 = text3.repeat(4);
console.log(repeat1);

//Replace 

let text4 = "Hello World World";
let replace1 = text4.replace('World', "Abhishek");
console.log(replace1);

//replaceAll
let replace2 = text4.replaceAll('World', 'Abhishek');
console.log(replace2);

//split()
let text5 = 'Hello';
let split1 = text5.split("");
console.log(split1);
