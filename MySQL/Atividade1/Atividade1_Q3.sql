create database db_sistema_escola;

use db_sistema_escola;

create table tb_estudantes(
id bigint auto_increment, 
primary key (id),			
nomeComplet varchar(255) not null,			
idade int null null,
ano int not null,
nomeResponsavel varchar(255) not null,
mensalidadeEmDia boolean not null,
mediaNota double not null
);

insert into tb_estudantes(nomeComplet,idade,ano,nomeResponsavel,mensalidadeEmDia, mediaNota) values ("Luiz Henrique Feitosa", 12, 7 , "Maria Luciana Feitosa", true, 7.5);
insert into tb_estudantes(nomeComplet,idade,ano,nomeResponsavel,mensalidadeEmDia, mediaNota) values ("Jonatas Ferreira Pinto", 11, 6 , "Gabriela Domingues Ferreira", true, 9.2);
insert into tb_estudantes(nomeComplet,idade,ano,nomeResponsavel,mensalidadeEmDia, mediaNota) values ("Luana Priscila Silva", 10, 5 , "Maria Luciana Feitosa", true, 6.0);
insert into tb_estudantes(nomeComplet,idade,ano,nomeResponsavel,mensalidadeEmDia, mediaNota) values ("Fabiana Cardoso Melo", 10, 5 , "Giovana Gonzaga Melo", false, 9.3);
insert into tb_estudantes(nomeComplet,idade,ano,nomeResponsavel,mensalidadeEmDia, mediaNota) values ("João Murilo Rosário", 11, 6 , "Lurdes Feitosa do Rosário", true, 6.8);
insert into tb_estudantes(nomeComplet,idade,ano,nomeResponsavel,mensalidadeEmDia, mediaNota) values ("Jorge Camargo de Sousa", 10, 5 , "Luciano Fonseca de Sousa", true, 8.0);
insert into tb_estudantes(nomeComplet,idade,ano,nomeResponsavel,mensalidadeEmDia, mediaNota) values ("Gabriel Pedrosa Gomes", 12, 7 , "Maria Luciana Gomes", false, 5.3);
insert into tb_estudantes(nomeComplet,idade,ano,nomeResponsavel,mensalidadeEmDia, mediaNota) values ("Lucas Douglas Pimentel", 11, 5 , "Gorete Fragoso Pimentel", true, 8.3);

select * from tb_estudantes where mediaNota>7.0;
select * from tb_estudantes where mediaNota<7.0;

#aumentar 1 ponto na média
update tb_estudantes set mediaNota = mediaNota+1.0 where id= 1;
update tb_estudantes set mediaNota = mediaNota+1.0 where id= 2;
update tb_estudantes set mediaNota = mediaNota+1.0 where id= 3;
update tb_estudantes set mediaNota = mediaNota+1.0 where id= 4;
update tb_estudantes set mediaNota = mediaNota+1.0 where id= 5;
update tb_estudantes set mediaNota = mediaNota+1.0 where id= 6;
update tb_estudantes set mediaNota = mediaNota+1.0 where id= 7;
update tb_estudantes set mediaNota = mediaNota+1.0 where id= 8;

#diminuir um ponto na nota
update tb_estudantes set mediaNota = mediaNota-1.0 where id= 1;
update tb_estudantes set mediaNota = mediaNota-1.0 where id= 2;
update tb_estudantes set mediaNota = mediaNota-1.0 where id= 3;
update tb_estudantes set mediaNota = mediaNota-1.0 where id= 4;
update tb_estudantes set mediaNota = mediaNota-1.0 where id= 5;
update tb_estudantes set mediaNota = mediaNota-1.0 where id= 6;
update tb_estudantes set mediaNota = mediaNota-1.0 where id= 7;
update tb_estudantes set mediaNota = mediaNota-1.0 where id= 8;

#mostrar tabela com todos os estudantes e suas informações
select * from tb_estudantes;
