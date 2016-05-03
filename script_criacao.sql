create database salaozao
use salaozao

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
primary key(id_cli)
);

create table Cliente_Login(
id_cli integer,
id_login integer,
primary key(id_cli,id_login),
foreign key(id_cli) references Cliente,
foreign key(id_login) references Login
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
foreign key (id_func) references Funcionario,
foreign key (id_login) references Login
);

create table Servico(
id_serv integer,
descricao varchar(40),
valor floar,
primary key(id_serv)
);

create table Atendimento(
id_atend integer,
id_func integer,
id_cli integer,
data date,
horario time,
id_servico integer,
total float,
primary key(id_atend),
foreign key(id_func) refences Funcionario,
foreign key(id_cli) refences Cliente,
foreign key(id_serv) refences Servico
);

create table Servico_Atendimento(
id_atend integer,
id_serv integer,
primary key(id_atend,id_serv),
foreign key(id_atend) references Atendimento,
foreign key(id_serv) references Servico
);