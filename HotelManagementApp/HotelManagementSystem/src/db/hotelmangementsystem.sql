create database hotelmanagementsystem;

USE hotelmanagementsystem;

create table login(username varchar(20),password varchar(20));
insert into login values('admin','admin123');
select * FROM LOGIN;

create table employee(name varchar(20),age int,gender varchar(20),s6 varchar(20), phone int, aadhar bigint, email varchar(20));
select * FROM employee;
drop table EMPLOYEE;
select * from login where username = "admin" and password = "admin123";

create table driver ( name varchar(20), age int, gender varchar(10),company varchar(25),brand varchar(20), available varchar(10) , location varchar(20));
select * from driver;
create table room(
  roomnumber varchar(10),
  availability varchar(20),
  cleaning_status varchar(10),
  price varchar(10),
  bed_type varchar(20)
  );
select * from room;
insert into room values(1001,"Available","Cleaned",2000,"DoubleBed");
insert into room values(1002,"Available","UnCleaned",2600,"SingleBed");
insert into room values(1003,"UnAvailable","Cleaned",2250,"SingleBed");
insert into room values(1004,"Available","Cleaned",2000,"SingleBed");
insert into room values(1005,"UnAvailable","UnCleaned",3000,"DoubleBed");
insert into room values(1006,"UnAvailable","UnCleaned",6540,"DoubleBed");
insert into room values(1007,"UnAvailable","UnCleaned",2000,"SigleBed");
insert into room values(1008,"Available","Cleaned",4600,"DoubleBed");
insert into room values(1009,"Available","UnCleaned",7000,"SingleBed");
insert into room values(1010,"Available","Cleaned",6800,"DoubleBed");
insert into room values(1011,"Available","Cleaned",2000,"DoubleBed");
insert into room values(1012,"UnAvailable","UnCleaned",2300,"SingleBed");
insert into room values(1013,"Available","Cleaned",3100,"SingleBed");
insert into room values(1014,"UnAvailable","Cleaned",2500,"SingleBed");
insert into room values(1015,"Available","UnCleaned",2000,"DoubleBed");
delete from room where roomnumber = 1001;