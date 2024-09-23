// function getData(getId) {

//     setTimeout(() => {
//         console.log("data" + getId)
//     }, 4000);
// }

// getData(1);
// getData(2);

//nested callback
//getNextData will check if there is next data print after the first
function fetchData(getName, getNextData) {
    setTimeout(() => {
        console.log("data " + getName);

        if (getNextData) {
            return getNextData();
        }
    }, 2000);
}


//using callback function
// fetchData(1, () => {
//     console.log("Getting data for 2...");
//     fetchData(2, () => {
//         console.log("Getting data for 3...");
//         fetchData(3, () => {
//             console.log("Getting data for 4...");
//             fetchData(4)
//         })
//     })
// });



// async function NS() {

//     // const D1 = await fetchData(1);
//     // console.log(D1);
//     console.log("Getting data 1...");
//     await fetchData(1);
//     console.log("Getting data 2...");
//     await fetchData(2);
//     console.log("Getting data 3...");
//     await fetchData(3);
//     console.log("Getting data 4...");
//     await fetchData(4);


// }
// NS();


//IIFE

(async function () {
    // console.log("Getting data 1...");
    await fetchData("Getting data 1..." + 1);
    console.log("Getting data 2...");
    await fetchData(2);
    console.log("Getting data 3...");
    await fetchData(3);
    console.log("Getting data 4...");
    await fetchData(4);
})();