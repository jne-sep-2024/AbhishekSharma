select * from students;

create database practice;
\c practice

create table test(
id int not null primary key,
name varchar(255)
);


select * from test;

--1. Transform and Filter an Array (Simulate Map Operation)

create table studentArray(

id serial primary key,
name varchar(100) not null,
scores Integer[]
);

select * from studentArray;

insert into studentArray(name, scores)
values
('Abhishek', '{50,65,80}'),
('Rohit', '{80,90,75}'),
('Santosh', '{45,65,78}');

select name, array
(select unnest_score * 2
from unnest(scores) as unnest_score
where unnest_score *2 > 150) as modified_value
from studentArray;


--2. Find Students Who Enrolled in Multiple Courses
create table student1(
student_id serial primary key,
name varchar(100) not null
);

create table course1(
course_id serial primary key,
course_name varchar(200) not null
);

create table enrollment(

	enrollment_id serial primary key,
	student_id int references student1(student_id) on delete cascade,
	course_id int references course1(course_id) on delete cascade,
	enrollment_date DATE not null default current_date
);


select * from student1;
select * from course1;
select * from enrollment;

insert into student1(name) values('Abhisek'), ('Rohit'),('Santosh');
insert into course1(course_name) values ('DSA'),('JAVA'),('Spring boot'),('JAVASCRIPT');

insert into enrollment(student_id, course_id) values
(1,1),
(2,1),
(1,3),
(3,1),
(3,3);

--select s.name, count(e.course_id) as total
--from student1 as s
--join enrollment as e
--on s.student_id = e.stduent_id,
--group by s.name;

SELECT s.name, COUNT(e.course_id) AS total
FROM student1 AS s
JOIN enrollment AS e ON s.student_id = e.student_id
GROUP BY s.name;


--3. Find Students with the Highest Score in Each Course

create table stduent2(
student_id serial primary key,
name varchar(200) not null
);

alter table stduent2 rename to student2;
select * from student2;
select * from course2;

create table course2(
course_id serial primary key,
course_name varchar(200) not null
);

create table scores(
score_id serial primary key,
student_id int references student2(student_id) on delete cascade,
course_id int references course2(course_id) on delete cascade,
score int not null
);

select * from scores;

insert into student2(name) values('Abhishek'),('Rohit'),('Santosh'),('Umesh');
insert into course2(course_name) values('Mathematics'),('Java'),('Spring boot');


insert into scores(student_id, course_id, score) values (1,1,85),(1,3,87),(2,3,74),(3,3,45);

select s.name, c.course_name
from student2 as s
join scores as sc on s.student_id = sc.student_id
join course2 as c on sc.course_id = c.course_id
order by s.name;

//find the max marks

select s.name, c.course_name, max(sc.score) as highest_score
from course2 as c
join scores as sc on sc.course_id = c.course_id
join student2 as s on sc.student_id = s.student_id
group by s.name, c.course_name
having MAX(sc.score) = (
select max(score) from scores
where course_id = c.course_id
);





select s.name, c.course_name, sc.score as highest_score
from course2 as c
join scores as sc on sc.course_id = c.course_id
join student2 as s on sc.student_id = s.student_id
join(
select course_id, max(score) as highest_score
from scores
group by course_id
) as hs on sc.course_id = hs.course_id and sc.score = hs.highest_score
order by s.name, c.course_name;

--4. Find Employees Who Earn More Than Their Manager

create table employees(
 employee_id serial primary key not null,
 name varchar(100) not null,
 salary decimal not null,
 manager_id integer references employees(employee_id) on delete set null
);

select * from employees;

insert into employees(name, salary, manager_id) values
('Boss', 80000, null),
('Rohit', 70000, 1),
('Abhishek', 5000, 2),
('Santosh', 10000,1),
('TL', 90000, 2);

select e.name as employee_name,e.salary as employee_salary,
	   e1.name as manager_name, e1.salary as manager_salary
from employees e
join employees e1
on e.manager_id = e1.employee_id
where e.salary > e1.salary;




















