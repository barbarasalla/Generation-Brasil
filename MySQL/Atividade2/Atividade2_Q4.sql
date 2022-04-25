create database db_cidades_das_carnes;

use db_cidades_das_carnes;

create table tb_categorias(
id  bigint not null auto_increment,
tipoProduto varchar(155) not null,
descricao longtext not null,
primary key(id)
);

insert into tb_categorias(tipoProduto, descricao) values ("aves", "Produtos de origem animal (frango).");
insert into tb_categorias(tipoProduto, descricao) values ("carne vermelha", "Produtos de origem animal (bois, vacas).");
insert into tb_categorias(tipoProduto, descricao) values ("suino", "Produtos de origem animal (porcos).");

select * from tb_categorias;

create table tb_produtos(
id bigint not null auto_increment,
produto varchar(155) not null,
precoPorKg double not null,
tipo enum ('natural', 'processado'),
marca enum('Sadia', 'Perdigão', 'Friboi', 'Da Casa', 'Outros') not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categorias(id)
);

insert into tb_produtos(produto, precoPorKg, tipo, marca, categoria_id) values ("Salsicha", 15.00, "processado", "Perdigão", 1);
insert into tb_produtos(produto, precoPorKg, tipo, marca, categoria_id) values ("Salsicha", 13.00, "processado", "Perdigão", 3);
insert into tb_produtos(produto, precoPorKg, tipo, marca, categoria_id) values ("Maminha", 90.00, "natural", "Friboi", 2);
insert into tb_produtos(produto, precoPorKg, tipo, marca, categoria_id) values ("Peito de Frango", 30.00, "natural", "Sadia", 1);
insert into tb_produtos(produto, precoPorKg, tipo, marca, categoria_id) values ("Frango Completo", 40.00, "natural", "Da Casa", 1);
insert into tb_produtos(produto, precoPorKg, tipo, marca, categoria_id) values ("Mortadela", 10.00, "processado", "Sadia", 1);
insert into tb_produtos(produto, precoPorKg, tipo, marca, categoria_id) values ("Carne Moida", 25.00, "natural", "Outros", 2);
insert into tb_produtos(produto, precoPorKg, tipo, marca, categoria_id) values ("Linguiça", 20.00, "processado", "Perdigão", 3);

select * from tb_produtos where precoPorKg > 50;
select * from tb_produtos where precoPorKg >=50 && preco<=150;
select * from tb_produtos where produto like "%c%";

#inner join
select tb_produtos.produto, tb_produtos.precoPorKg, tb_produtos.tipo, tb_produtos.marca, tb_categorias.tipoProduto, tb_categorias.descricao from tb_produtos
inner join tb_categorias on tb_categorias.id = tb_produtos.categoria_id;

select tb_produtos.produto, tb_produtos.precoPorKg, tb_produtos.tipo, tb_produtos.marca, tb_categorias.tipoProduto, tb_categorias.descricao from tb_produtos
inner join tb_categorias on tb_categorias.id = tb_produtos.categoria_id where tb_categorias.tipoProduto="aves";


