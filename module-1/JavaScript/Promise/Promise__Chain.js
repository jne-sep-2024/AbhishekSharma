function asyncFunc1() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Data 1");
            resolve("Resolved Function 1");
        }, 4000);
    });
}

function asyncFunc2() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Data 2");
            resolve("Resolved Fucntion 2");
        }, 4000);
    });
}



// let p1 = asyncFunc1();
// console.log("Fetching Data 1");
// p1.then((res) => { console.log("Success", res); });

// let p2 = asyncFunc2();
// console.log("Fetching Data 2");
// p2.then((res) => { console.log("Success", res); });


//Applying Promise chain it will print data 1 then afetr data 2

// let promise1 = asyncFunc1();
// console.log("Fetching data 1.....");
// promise1.then((res) => {
//     console.log("Promise 1", res)

//     //Nesting Promiss chain
//     let promise2 = asyncFunc2();
//     console.log("Fetching data 2.....");

//     promise2.then((res) => {
//         console.log("Promise 2", res);
//      })
// });


//Promise Chaining
// asyncFunc1().then((res) => {
//     return asyncFunc2();
// })
//     .then((res) => {
//         console.log("Resolve", res);

//     });


//Async-Await

async function getResult() {

    //1st call
    const r1 = await asyncFunc1();
    console.log(r1)

    //2nd Call
    const r2 = await asyncFunc2();
    console.log(r2)
}

getResult();