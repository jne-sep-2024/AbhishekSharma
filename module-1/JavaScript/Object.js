//Creating an object key:value

//1. The dot notation 

let person = {
    f_name: 'Abhishek',
    l_name: 'Sharma'
};

console.log(person.f_name + " " + person.l_name);
//console.log(person.l_name);

//Array like notation

let emp = {
    emp_id: '01',
    emp_name: "Abhishek"
};

console.log(emp['emp_id'] + " " + emp['emp_name']);
console.log(emp);

//Modifyng the value

let job = {
    job_id: '01',
    job_dept: "Developer"
};

console.log(job.job_id + " " + job['job_dept']);

job.job_id = '02';
console.log(job.job_id + " " + job['job_dept']);

//adding a new property to an object
job.job_handler = 'Abhishek';
console.log(job.job_id + " " + job['job_dept'] + " " + job.job_handler);

//Deleting a property of an object
delete job.job_handler;
console.log(job.job_id + " " + job['job_dept'] + " " + job.job_handler);

//Checking if the property exists or not
console.log('job_handler' in job);
console.log('job_id' in job);




