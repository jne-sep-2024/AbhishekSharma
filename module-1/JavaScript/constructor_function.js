//Create a funtion which store username, useremail, isloggeduvin
function user(userName, userEmail, isLoggedIn) {

    this.userName = userName;
    this.userEmail = userEmail;
    this.isLoggedIn = isLoggedIn;

    return this;
}

//Constructor 
const userOne = new user("Abhishek", "a@gmail.com", true);
const userTwo = new user("Rohit", "R@outlook.com", false);

console.log(userOne);
console.log(userTwo);