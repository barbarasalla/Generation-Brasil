create database bd_servicos_rh;

use bd_servicos_rh;

create table tb_funcionarios(
id bigint auto_increment, 
primary key (id),			
nomeComplet varchar(255) not null,			
idade int null null,
setor varchar(255) not null,
funcao varchar(255) not null,
salario double not null
);

insert into tb_funcionarios(nomeComplet,idade,setor,funcao,salario) values ("Maria Luiza da Silva", 30, "Administrativo" , "Gerente", 5120.00);
insert into tb_funcionarios(nomeComplet,idade,setor,funcao,salario) values ("Gustavo Fernando Rodrigue", 25, "Serviço Geral" , "Porteiro/a", 1800.00);
insert into tb_funcionarios(nomeComplet,idade,setor,funcao,salario) values ("Gabriela Maria Oliveira", 31, "Atendimento" , "Garçom/Garçonete", 2500.00);
insert into tb_funcionarios(nomeComplet,idade,setor,funcao,salario) values ("Lucas Juliano Ferreira", 25, "Atendimento" , "Bartender", 3000.00);
insert into tb_funcionarios(nomeComplet,idade,setor,funcao,salario) values ("Lucas Juliano Ferreira", 25, "Serviço Geral" , "Aux. Serviço Geral", 1800.00);

select * from tb_funcionarios where salario>2000.00;
select * from tb_funcionarios where salario<2000.00;

#atualizações
update tb_funcionarios set salario = 1900.00 where id =3;