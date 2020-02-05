select user(), database ();

select deptno, deptname, floor from department;

select empno, empname, title, manager, salary, dno from employee;

select * from department where deptno = 3;

insert into department  values (5, '마케팅', 8);
update  department set deptname = '마케팅2', floor = 7 where deptno = 0;
delete from department where deptno = 5;
delete from department where deptno = 6;
delete from employee where empno = 1004;
delete from employee where empno = 1005;
select deptno, deptname, floor from department where deptno = 3;
desc employee ;