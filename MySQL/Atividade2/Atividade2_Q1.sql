create database db_game;

use db_game;

create table tb_classes(
id  bigint not null auto_increment,
classe varchar(255) not null,
descricao longtext,
primary key(id)
);

insert into tb_classes (classe, descricao) values ('Força', "Possuem muita força, sempre prontos para o combate. Possuem extremas habilidades de combate.");
insert into tb_classes (classe, descricao) values ('Agilidade', "Com muita agilidade, o personagem pode correr mais rápido, equilibrar-se melhor sobre um muro, esquivar-se de ataques.");
insert into tb_classes (classe,descricao) values ('Inteligência','Inteligência é a capacidade de resolver problemas, nem mais e nem menos. O personagem está mais apto a compreender o que ocorre à sua volta e não se deixa enganar tão facilmente. Também lida com a memória, capacidade de abstrair conceitos e descobrir coisas novas.');
insert into tb_classes (classe,descricao) values ('Destreza','Define a habilidade manual do Personagem, sua destreza com as mãos e/ou pés. Não inclui a agilidade corporal, apenas a destreza manual.' );
insert into tb_classes (classe,descricao) values ('Percepção','Personagem com capacidade de observar o mundo à volta e perceber detalhes importantes.' );

select * from tb_classes;

create table tb_personagens(
id bigint not null auto_increment,
nome varchar(255) not null,
habitat varchar (155),
ataque int not null,
defesa int not null,
classe_id bigint,
primary key(id),
foreign key (classe_id) references tb_classes(id)
);

insert into tb_personagens (nome, habitat, ataque, defesa, classe_id) values ('Mulher Cobra', 'solo/agua', 3000, 1500, 5);
insert into tb_personagens (nome, habitat, ataque, defesa, classe_id) values ('Homem Zebra', 'savana', 3000, 4000, 3);
insert into tb_personagens (nome, habitat, ataque, defesa, classe_id) values ('Mulher Lobo', 'Hemisfério Norte', 4000, 2000, 2);
insert into tb_personagens (nome, habitat, ataque, defesa, classe_id) values ('Homem Tartaruga', 'agua/solo', 1000, 3000, 3);
insert into tb_personagens (nome, habitat, ataque, defesa, classe_id) values ('Homem Gavião', 'floresta/cidade', 3000, 5000, 5);
insert into tb_personagens (nome, habitat, ataque, defesa, classe_id) values ('Mulher Rinoceronte', 'savana', 5000, 2000, 1);
insert into tb_personagens (nome, habitat, ataque, defesa, classe_id) values ('Homem Carcará', 'cerrado/caatinga/,matas', 5000, 4000, 5);
insert into tb_personagens (nome, habitat, ataque, defesa, classe_id) values ('Mulher Onça', 'floresta', 4500, 4000, 2);
insert into tb_personagens (nome, habitat, ataque, defesa, classe_id) values ('Homem Timbu', 'mata/cidade', 5000, 5000, 4);

select * from tb_personagens;

select * from tb_personagens where ataque > 2000;
select * from tb_personagens where defesa >1000 && defesa<2000;
select * from tb_personagens where nome like "%c%";


#inner join
select tb_personagens.nome, tb_personagens.habitat, tb_personagens.ataque, tb_personagens.defesa, tb_classes.classe, tb_classes.descricao from tb_personagens
inner join tb_classes on tb_classes.id = tb_personagens.classe_id;

select tb_personagens.nome, tb_personagens.habitat, tb_personagens.ataque, tb_personagens.defesa, tb_classes.classe, tb_classes.descricao from tb_personagens
inner join tb_classes on tb_classes.id = tb_personagens.classe_id where tb_classes.classe="Inteligência";
