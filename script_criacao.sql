create database salaozao;
use salaozao;

create table Login(
id_login integer,
user varchar(40),
senha varchar(20),
primary key(id_login)
);

create table Cargo(
id_cargo integer,
descricao varchar(40),
primary key(id_cargo)
);

create table Cliente(
id_cli integer,
nome_cli varchar(40),
data_nasc_cli date,
cpf_cli varchar(11),
login_id integer,
celular varchar(12),
primary key(id_cli)
);

create table Cliente_Login(
id_cli integer,
id_login integer,
primary key(id_cli,id_login),
foreign key(id_cli) references Cliente(id_cli),
foreign key(id_login) references Login(id_login)
);

create table Funcionario(
id_func integer,
nome_func varchar(40),
idade_func integer,
cpf_func varchar(11),
pis_func varchar(40),
salario_func float,
cargo_id integer,
login_id integer,
primary key(id_func)
);

create table Funcionario_Login(
id_func integer,
id_login integer,
primary key(id_func, id_login),
foreign key (id_func) references Funcionario(id_func),
foreign key (id_login) references Login(id_login)
);

create table Servico(
id_serv integer,
descricao varchar(40),
valor float,
primary key(id_serv)
);

create table Atendimento(
id_atend integer,
id_func integer,
id_cli integer,
data date,
horario time,
total float,
primary key(id_atend),
foreign key(id_func) references Funcionario(id_func),
foreign key(id_cli) references Cliente(id_cli)
);

create table Servico_Atendimento(
id_atend integer,
id_serv integer,
quantidade integer,
primary key(id_atend,id_serv),
foreign key(id_atend) references Atendimento(id_atend),
foreign key(id_serv) references Servico(id_serv)
);

INSERT INTO Cargo VALUES (0,'admin'),(1,'Gerente'),(2,'Atendente'),(3,'Caixa'),(4,'Cabeleleira');
INSERT INTO Cliente VALUES (1,'gabriel','1996-10-15','00000000000',1,'4498469220'),(3,'Gabriel','1996-10-15','11122233344',3,'4498469220');
INSERT INTO Funcionario VALUES (1,'admin',0,'0','0',0,0,0);
INSERT INTO Login VALUES (0,'admin','admin'),(1,'cliente','cliente'),(3,'negrao','negrao');
INSERT INTO Cliente_Login VALUES (1,1),(3,3);
INSERT INTO Funcionario_Login VALUES (1,0);


