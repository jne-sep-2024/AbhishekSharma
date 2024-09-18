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

];

user.filter(item => item.age > 18).map((item) => {
    console.log(item);

});
