const getPromise = () => {
    return new Promise((resolve, reject) => {
        console.log("I am a promise");
        //resolve("Success");
        reject("Network Error");
    });
};

let promise = getPromise();

promise.then((res) => {
    console.log("Promise Fullfiled", res);
});

promise.catch((err) => {
    console.log("Some error occured", err);
});