function returnFunc() {
    //let a = 1;
    const x = () => {
        let a = 1;
        console.log(a);

        const y = () => {
            //  let a = 2;
            console.log(a);


            const z = () => {
                let a = 3;
                console.log(a);

            }
            z();
        }
        a = 43;
        y();
    }
    x();
}

returnFunc();
// let c = returnFunc();
// console.log(c);
