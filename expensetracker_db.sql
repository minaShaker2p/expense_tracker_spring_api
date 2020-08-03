DROP  DATABASE expensetrackerdb;
DROP user expensetracker;
CREATE USER expensetracker WITH password 'password';
CREATE DATABASE  expensetrackerdb WITH  template=template0 OWNER=expensetracker;
\connect expensetrackerdb;

ALTER DEFAULT PRIVILEGES GRANT ALL ON tables TO expensetracker;ALTER DEFAULT PRIVILEGES GRANT
ALL ON sequences TO expensetracker;

CREATE TABLE et_users(
user_id integer primary key not null,
first_name varchar(20)NOT NULL,
last_name varchar(20)not null,
email varchar(30)not null,
password text not null
);

create table et_categories(
category_id integer primary key not null,
user_id integer not null,
title varchar(20)not null,
description varchar(50)not null
);

alter table et_categories add constraint cat_users_fk
foreign key (user_id) references et_users(user_id);

create table et_transactions(
transaction_id integer primary key not null,
category_id integer not null,
user_id integer not null ,
amount numeric(10,2) not null ,
note varchar(50) not null,
transaction_date bigint not NULL );

alter table et_transactions add constraint trans_cat_fk
foreign key (category_id) references et_categories(category_id);

alter table et_transactions add constraint trans_users_fk
foreign key (user_id) references et_users(user_id);

create sequence et_users_seq increment 1 start 1;
create sequence et_categories_seq increment 1 start 1;
create sequence et_transaction_seq increment 1 start 1000;


