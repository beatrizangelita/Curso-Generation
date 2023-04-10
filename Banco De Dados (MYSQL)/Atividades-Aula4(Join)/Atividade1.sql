-- Crie um banco de dados para um serviço de um Games Online. 
-- O nome do Banco de dados deverá ter o seguinte nome db_generation_game_online. 
-- O sistema trabalhará com as informações dos personagens do jogo. 
-- O sistema trabalhará com 2 tabelas tb_personagens e tb_classes, que deverão estar relacionadas.

-- Criar um banco de dados
CREATE DATABASE db_generation_game_online;

-- Crie a tabela tb_classes e determine pelo menos 2 atributos, além da Chave Primária, relevantes para classificar os personagens do Game Online.
CREATE TABLE tb_classes(
	id_classe bigint auto_increment,
    turma_classe varchar(200),
    categoria_classe varchar(200),
    PRIMARY KEY (id_classe)
);

-- Crie a tabela tb_personagens e determine 4 atributos, além da Chave Primária, relevantes aos personagens do Game Online.
CREATE TABLE tb_personagens(
	id_personagem bigint auto_increment,
    nome_personagem varchar(200),
    nick_personagem varchar(200),
    idade_personagem int (2),
    PRIMARY KEY (id_personagem),
	FOREIGN KEY (id_classe) references tb_personagens(id_personagem) -- Não esqueça de criar a Foreign Key da tabela tb_classes na tabela tb_personagens
);