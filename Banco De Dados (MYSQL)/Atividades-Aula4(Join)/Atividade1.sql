-- Crie um banco de dados para um serviço de um Games Online. 
-- O nome do Banco de dados deverá ter o seguinte nome db_generation_game_online. 
-- O sistema trabalhará com as informações dos personagens do jogo. 
-- O sistema trabalhará com 2 tabelas tb_personagens e tb_classes, que deverão estar relacionadas.

-- Criar banco de dados db_generation_game_online.
CREATE DATABASE db_generation_game_online;

-- Conectar com o banco de dados db_generation_game_online.
USE db_generation_game_online;

-- Crie a tabela tb_classes e determine pelo menos 2 atributos, além da Chave Primária, relevantes para classificar os personagens do Game Online.
CREATE TABLE tb_classes(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR (200),
    nivel int (5)
);

-- Crie a tabela tb_personagens e determine 4 atributos, além da Chave Primária, relevantes aos personagens do Game Online.
CREATE TABLE tb_personagens(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    classe_id BIGINT, -- declarando o id da tabela tb_classes
    nome VARCHAR (200),
    nick_name VARCHAR (200),
    defesa INT (5),
    ataque INT (5),
    FOREIGN KEY (classe_id) REFERENCES tb_classes(id) -- Não esqueça de criar a Foreign Key da tabela tb_classes na tabela tb_personagens.
);

-- Insira 5 registros na tabela tb_classes.
INSERT INTO tb_classes (descricao, nivel) VALUES ("Fácil",1);
INSERT INTO tb_classes (descricao, nivel) VALUES ("Moderado",2);
INSERT INTO tb_classes (descricao, nivel) VALUES ("Desafiante",3);
INSERT INTO tb_classes (descricao, nivel) VALUES ("Difícil",4);
INSERT INTO tb_classes (descricao, nivel) VALUES ("Muito Difícil",5);

-- Validar se os dados foram inseridos na tabela tb_classes
SELECT * FROM tb_classes;

-- Insira 8 registros na tabela tb_personagens, preenchendo a Chave Estrangeira para criar a relação com a tabela tb_classes.
INSERT INTO tb_personagens (classe_id, nome, nick_name, defesa, ataque) VALUES (1,"Bruna", "Barbie", 10000, 5000);
INSERT INTO tb_personagens (classe_id, nome, nick_name, defesa, ataque) VALUES (2,"Beatriz", "Bart", 1560, 2500);
INSERT INTO tb_personagens (classe_id, nome, nick_name, defesa, ataque) VALUES (3,"Bruno", "Lisa", 2548, 1000);
INSERT INTO tb_personagens (classe_id, nome, nick_name, defesa, ataque) VALUES (4,"Ziza", "Marge", 9758, 5800);
INSERT INTO tb_personagens (classe_id, nome, nick_name, defesa, ataque) VALUES (5,"Messias", "Home", 1000, 10000);
INSERT INTO tb_personagens (classe_id, nome, nick_name, defesa, ataque) VALUES (5,"Whisky", "Maggie", 356, 6580);
INSERT INTO tb_personagens (classe_id, nome, nick_name, defesa, ataque) VALUES (4,"Tob", "PapaiNoel", 150, 3000);
INSERT INTO tb_personagens (classe_id, nome, nick_name, defesa, ataque) VALUES (3,"Brunce", "Doidinho", 945, 9874);

-- Validar se os dados foram inseridos na tabela tb_classes
SELECT * FROM tb_personagens;

-- Faça um SELECT que retorne todes os personagens cujo poder de ataque seja maior do que 2000.
SELECT * FROM tb_personagens WHERE ataque > 2000;

-- Faça um SELECT que retorne todes os personagens cujo poder de defesa esteja no intervalo 1000 e 2000.
SELECT * FROM tb_personagens WHERE defesa BETWEEN 1000 AND 2000;

-- Faça um SELECT utilizando o operador LIKE, buscando todes os personagens que possuam a letra C no atributo nome.
SELECT * FROM tb_personagens WHERE nome LIKE "%b%";

-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens com os dados da tabela tb_classes.
SELECT a.nome, a.nick_name, a.defesa, a.ataque
FROM tb_personagens a 
INNER JOIN tb_classes b ON a.classe_id = b.id;

-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_personagens com os dados da tabela tb_classes, 
-- onde traga apenas os personagens que pertençam a uma classe específica (Exemplo: Todes os personagens da classe dos arqueiros).
SELECT a.nome, a.nick_name, a.defesa, a.ataque,
	b.id, b.descricao, b.nivel
FROM tb_personagens a 
INNER JOIN tb_classes b ON a.classe_id = b.id
WHERE b.id = 5;



