create table mvc_member(
	num int primary key auto_increment,
	id varchar(30) UNIQUE,
	pass varchar(30) not null,
	name varchar(10),
	age int(3),
	gender varchar(10),
	joinYN char(1) default 'Y',
	regdate timestamp default now(),
	updatedate timestamp default now()
);

insert into mvc_member(id,pass,name,age,gender)
values('admin','admin','관리자',30,'male')

select * from mvc_member;

commit;