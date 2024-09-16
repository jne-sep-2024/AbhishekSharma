let btn1 = document.querySelector('#btn1');

btn1.onclick = () => {

    console.log("Btn 1 is clicked!!");

}

let btn2 = document.querySelector('#btn2');

btn2.ondblclick = () => {
    console.log("Btn2 is click double time");

}

let div = document.querySelector('div')

div.onmouseover = () => {
    console.log("you are inside div");

}

let btn3 = document.querySelector('#btn3');

btn3.addEventListener('click', () => {
    console.log("Button 3, Handler 1");

});

btn3.addEventListener('click', () => {
    console.log("Button 3, Handler 2");

});

btn3.addEventListener('click', () => {
    console.log("Button 3, Handler 3");

});



//if we want to remove any event we have to 
//initliaze that event in some variable
//suppose we want to remove handler 4

const h4 = () => {

    console.log("Handler 4");

}

btn3.addEventListener('click', h4);
//this will remove the event
btn3.removeEventListener('click', h4);


let modeBtn = document.querySelector('#mode');

let currMode = "light";

modeBtn.addEventListener('click', () => {

    if (currMode === 'light') {
        currMode = 'dark';
        //document.getElementById('mode').style.backgroundColor = "black";
        //document.querySelector('body').style.backgroundColor = 'black';
        //with the help of style.css
        document.querySelector('body').classList.remove('light');
        document.querySelector('body').classList.add('dark');

    }
    else {

        currMode = 'light';
        // document.getElementById('mode').style.backgroundColor = "white";
        // document.querySelector('body').style.backgroundColor = 'white';
        //with the help of style css
        document.querySelector('body').classList.remove('dark');
        document.querySelector('body').classList.add('light');
    }

    console.log(currMode);
})
