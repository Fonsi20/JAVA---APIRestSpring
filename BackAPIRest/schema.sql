CREATE TABLE accounts 
( 
    id IDENTITY NOT NULL PRIMARY KEY ,
    name NVARCHAR(250) NOT NULL ,
    limit_ real not null,
    createdAt TIMESTAMP,
	balance Double not null
) ;

CREATE TABLE movements_types
( 
    id IDENTITY NOT NULL PRIMARY KEY ,
    name NVARCHAR(250) NOT NULL,
	multiplicador int not null
) ;


CREATE TABLE movements 
(  
    id_movement IDENTITY NOT NULL PRIMARY KEY,
    id_type int NOT NULL,
    id_account int not null,
    amount real not null,
    create_date timestamp not null
) ;

alter table movements add FOREIGN key (id_type) references movements_types(id);
alter table movements add FOREIGN key (id_account) references account(id);


insert into movements_types(name, multiplicador) values('withdrawal', -1);
insert into movements_types(name, multiplicador) values('deposit', 1);


insert into ACCOUNTS (name,limit_,createdat,balance)values('Cristiano',60,'2021-06-20',9000)