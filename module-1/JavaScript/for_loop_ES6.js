const abhi = {
    name: "Abhishek"
}

const roh = {
    name: "Rohit"
}

const userRole = new Map();

userRole.set(abhi, "Admin");
userRole.set(roh, "CEO");


//for..of
//here user is key and role is value defined in userRole
for (const [user, role] of userRole) {
    console.log(`${user.name}, ${role}`);

}


//Example of for..in

const user = {
    firstName: 'Abhishek',
    lastName: 'Sharma',
    ssn: "123 - 456 - 789"
}

for (var prop in user) {
    console.log(prop + ": " + user[prop]);

}