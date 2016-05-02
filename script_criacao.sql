create database salaozao
use salaozao

create table Cargo(
id_cargo integer,
descricao varchar(40),
primary key(id_cargo)
);

create table Cliente(
id_cli integer,
nome_cli varchar(40),
idade_cli integer,
cpf_cli varchar(11),
primary key(id_cli)
);

create table Funcionario(
id_func integer,
nome_func varchar(40),
idade_func integer,
cpf_func varchar(11),
pis_func varchar(40),
salario_func,
cargo_id integer,
primary key(id_func)
);

create table Servico(
id_serv integer,
descricao varchar(40),
primary key(id_serv)
);

create table Atendimento(
id_func integer,
id_cli integer,
data varchar(10),
horario varchar(10),
id_servico integer,
primary key(id_func, id_cli, data, horario),
foreign key(id_func) refences Funcionario,
foreign key(id_cli) refences Cliente,
foreign key(id_serv) refences Servico
);