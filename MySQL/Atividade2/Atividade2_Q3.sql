create database db_farmacia_bem_estar;

use db_farmacia_bem_estar;

create table tb_categorias(
id  bigint not null auto_increment,
tipoProduto varchar(155) not null,
descricao longtext not null,
primary key(id)
);

insert into tb_categorias(tipoProduto, descricao) values ("cosméticos", "Produtos voltados para cuidados pessoais.");
insert into tb_categorias(tipoProduto, descricao) values ("remédios", "Produtos voltados para tratamento de saúde.");
insert into tb_categorias(tipoProduto, descricao) values ("Higiene", "Produtos voltados para higiene pessoal.");

select * from tb_categorias;

create table tb_produtos(
id bigint not null auto_increment,
produto varchar(155) not null,
preco double not null,
tipo enum ('liquido', 'sólido', 'cremoso', 'acuoso') not null,
publico enum('Adulto', 'Infantil', 'Adulto/Infantil'),
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categorias(id)
);

insert into tb_produtos(produto, preco, tipo, publico, categoria_id) values ("Neosaldina", 10.00, "sólido", "Adulto", 2);
insert into tb_produtos(produto, preco, tipo, publico, categoria_id) values ("Dorflex", 15.00, "sólido", "Adulto", 2);
insert into tb_produtos(produto, preco, tipo, categoria_id) values ("Papel Higienico", 20.00, "sólido",3);
insert into tb_produtos(produto, preco, tipo, publico, categoria_id) values ("Creme Dental", 8.00, "cremoso", "Infantil", 3);
insert into tb_produtos(produto, preco, tipo, publico, categoria_id) values ("Creme Dental", 10.00, "cremoso", "Adulto", 3);
insert into tb_produtos(produto, preco, tipo, publico, categoria_id) values ("Hidratante Facial", 60.00, "cremoso", "Adulto", 1);
insert into tb_produtos(produto, preco, tipo, publico, categoria_id) values ("Hidratante Facial P/ Pele Oleosa", 80.00, "acuoso", "Adulto", 1);
insert into tb_produtos(produto, preco, tipo, publico, categoria_id) values ("Protetor Solar", 30.00, "cremoso", "Infantil", 1);

select * from tb_produtos where preco > 50;
select * from tb_produtos where preco >=5 && preco<=60;
select * from tb_produtos where produto like "%c%";

#inner join
select tb_categorias.tipoProduto, tb_categorias.descricao,tb_produtos.produto, tb_produtos.preco, tb_produtos.tipo, tb_produtos.publico from tb_produtos
inner join tb_categorias on tb_categorias.id = tb_produtos.categoria_id;

select tb_categorias.tipoProduto, tb_categorias.descricao,tb_produtos.produto, tb_produtos.preco, tb_produtos.tipo, tb_produtos.publico from tb_produtos
inner join tb_categorias on tb_categorias.id = tb_produtos.categoria_id where tb_categorias.tipoProduto="cosméticos";


