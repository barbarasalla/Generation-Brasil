create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categorias(
id  bigint not null auto_increment,
formato enum ('Pizza Cone', 'Pizza Quadrada', 'Pizza Redonda'),
tipo enum ('Doce', 'Salgada') not null,
primary key(id)
);

insert into tb_categorias (formato, tipo) values ('Pizza Cone','Doce');
insert into tb_categorias (formato, tipo) values ('Pizza Quadrada','Doce');
insert into tb_categorias (formato, tipo) values ('Pizza Redonda','Doce');
insert into tb_categorias (formato, tipo) values ('Pizza Cone','Salgada');
insert into tb_categorias (formato, tipo) values ('Pizza Quadrada','Salgada');
insert into tb_categorias(formato, tipo) values ('Pizza Redonda','Salgada');

select * from tb_categorias;

create table tb_pizzas(
id bigint not null auto_increment,
sabor varchar(255) not null,
tamanho enum ('P', 'M', 'G'),
borda enum ('s', 'n'),
quantidade int not null,
preco double,
precoTot double,
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categorias(id)
);

insert into tb_pizzas (sabor, tamanho, borda, quantidade, preco, precoTot, categoria_id) values ('Mussarela', 'P' ,'s', 1 , 20.00, preco*quantidade,4);
insert into tb_pizzas (sabor, tamanho, borda, quantidade, preco, precoTot, categoria_id) values ('Mussarela', 'P' ,'n', 1 , 15.00, preco*quantidade,4);
insert into tb_pizzas (sabor, tamanho, borda, quantidade, preco, precoTot, categoria_id) values ('Mussarela', 'M' ,'N', 1 , 20.00, preco*quantidade,5);
insert into tb_pizzas (sabor, tamanho, borda, quantidade, preco, precoTot, categoria_id) values ('Mussarela', 'M' ,'s', 1 , 25.00, preco*quantidade,5);
insert into tb_pizzas (sabor, tamanho, borda, quantidade, preco, precoTot, categoria_id) values ('Mussarela', 'G' ,'s', 1 , 50.00, preco*quantidade,6);
insert into tb_pizzas (sabor, tamanho, borda, quantidade, preco, precoTot, categoria_id) values ('Mussarela', 'P' ,'N', 1 , 15.00, preco*quantidade,6);
insert into tb_pizzas (sabor, tamanho, borda, quantidade, preco, precoTot, categoria_id) values ('Calabreça', 'P' ,'n', 2 , 15.00, preco*quantidade,6);
insert into tb_pizzas (sabor, tamanho, borda, quantidade, preco, precoTot, categoria_id) values ('Calabreça', 'M' ,'n', 1 , 20.00, preco*quantidade,5);
insert into tb_pizzas (sabor, tamanho, borda, quantidade, preco, precoTot, categoria_id) values ('Calabreça', 'G' ,'n', 1 , 45.00, preco*quantidade,5);
insert into tb_pizzas (sabor, tamanho, borda, quantidade, preco, precoTot, categoria_id) values ('Calabreça', 'G' ,'s', 1 , 50.00, preco*quantidade,5);
insert into tb_pizzas (sabor, tamanho, borda, quantidade, preco, precoTot, categoria_id) values ('Chocolate', 'P' ,'n', 1 , 20.00, preco*quantidade,1);
insert into tb_pizzas (sabor, tamanho, borda, quantidade, preco, precoTot, categoria_id) values ('Chocolate', 'P' ,'s', 1 , 25.00, preco*quantidade,2);
insert into tb_pizzas (sabor, tamanho, borda, quantidade, preco, precoTot, categoria_id) values ('Chocolate', 'M' ,'s', 1 , 30.00, preco*quantidade,3);

select * from tb_pizzas;

select * from tb_pizzas where preco > 45;
select * from tb_pizzas where preco >=50 && preco<=100;
select * from tb_pizzas where sabor like "%m%";

#inner join
select tb_categorias.formato, tb_categorias.tipo,tb_pizzas.sabor, tb_pizzas.tamanho, tb_pizzas.borda, tb_pizzas.quantidade, tb_pizzas.preco, tb_pizzas.precoTot from tb_pizzas
inner join tb_categorias on tb_categorias.id = tb_pizzas.categoria_id;

select tb_categorias.formato, tb_categorias.tipo,tb_pizzas.sabor, tb_pizzas.tamanho, tb_pizzas.borda, tb_pizzas.quantidade, tb_pizzas.preco, tb_pizzas.precoTot from tb_pizzas
inner join tb_categorias on tb_categorias.id = tb_pizzas.categoria_id where tb_categorias.tipo="Doce";

