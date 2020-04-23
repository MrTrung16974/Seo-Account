-- create database
CREATE SCHEMA `seoaccount` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci ;
use seoaccount;

-- create table game
create table game(
	id int(6) unsigned primary key not null AUTO_INCREMENT,
    name nvarchar(250) not null,
    code nvarchar(20) not null,
    new_price varchar(100) not null,
    old_price varchar(100) null,
	game_describe text null,
	image varchar(200) not null,
    trailer varchar(200) not null,
    star int(1) null,
    promation int(6) not null,
    category_id int(6) not null,
    menu_id int(6) null
);

-- create table menu
create table menu(
	id int(6) unsigned primary key not null AUTO_INCREMENT,
    name nvarchar(250) not null,
    image nvarchar(250) not null
);

-- create table category
create table category(
	id int(6) unsigned primary key not null AUTO_INCREMENT,
    category nvarchar(250) not null,
    code nvarchar(20) not null
);
