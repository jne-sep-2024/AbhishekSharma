function api() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Whether API");
            // resolve("Success");
            resolve(200);
        }, 2000);
    });
}

function api2() {

    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Map API");
        }, 2000);
    });
}

async function getWhether() {

     const whetherResult = await api();
    //await api();
     console.log(whetherResult);

    await api2();
}

getWhether();