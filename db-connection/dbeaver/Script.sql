select * from user;

delete from user where id_user = 5;

INSERT INTO user (email,name,surname,age,salary)VALUES('myname123@stud.feec.vutbr.cz', 'Jon','Doe', 30, 10000);

INSERT INTO user (email,name,surname,age,salary)VALUES('240913@vutbr.cz', 'Juraj','Goryl', 21, 100000);

INSERT INTO user (email,name,surname)
VALUES('240913@vutbr.cz', 'Juraj','Goryl');

SELECT * FROM user WHERE email = '240913@vutbr.cz';

SELECT * FROM user WHERE email = ?

INSERT INTO user (email,name,surname) VALUES(?,?,?);

select email, name, surname  from user; 

select * from user;
select * from role;

select * from user_has_role uhr ;

select * from user u join user_has_role uhr on u.id_user = uhr.user_id_user;
select * from user u ,user_has_role uhr where u.id_user = uhr.user_id_user;

select * from user u left join user_has_role uhr on u.id_user = uhr.user_id_user;

select * from user u , user_has_role uhr;
select * from user u cross join user_has_role uhr; --kartezsky sucin

select id_user, email, name, surname, age, salary 
from user u join user_has_role uhr on u.id_user = uhr.user_id_user 
where uhr.role_id_role = 1;

select id_user, email, name, surname, age, salary 
from user u ,user_has_role uhr 
where u.id_user = uhr.user_id_user and uhr.role_id_role = 1;

update user set salary = salary * 1.2 where email = '240913@vutbr.cz';
select * from user;
select name from role;

insert into role (name) values ('brigadnik');
insert into user_has_role (user_id_user, role_id_role) values (4,4);

select * from role;
select * from user_has_role uhr ;



 
