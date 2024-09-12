var fibo = function fibo(n) {
    if (n <= 1) {
        return 1;
    }
    else {
        return fibo(n - 1) + fibo(n - 2);
    }
}

console.log(fibo(5));


function fibonacci(n) {

    let a = 0, b = 1;
    console.log(a, b);

    if (n > 1) {

        next = a + b;
        console.log(next);
        a = b;
        b = next;

    }
}

console.log(fibonacci(5))