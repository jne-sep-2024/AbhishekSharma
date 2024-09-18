const user = [
    {
        name: "Abhishek",
        age: 26
    },

    {
        name: "Rohit",
        age: 26
    },
    {
        name: "Santosh",
        age: 27
    },
    {
        name: "Trinay",
        age: 1
    }

]

// user.forEach((item) => {

//     if(item.age > 10)
//     {
//     console.log(item.age);
//     return;
//     }
//     //return item.age > 10;
// });

let filter1 = user.filter(item => item.age > 10).forEach((item) => {
    console.log(item);
});

// console.log(filter1);

