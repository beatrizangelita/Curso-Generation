-- Crie um banco de dados para um serviço de um Açougue ou de um Hortifruti. 
-- O nome do Banco de dados deverá ter o seguinte nome db_cidade_das_carnes ou cidade_dos_vegetais. 
-- O sistema trabalhará com as informações dos produtos comercializados pela empresa. 
-- O sistema trabalhará com 2 tabelas tb_produtos e tb_categorias, que deverão estar relacionadas.

-- Criar banco de dados db_generation_game_online.
CREATE DATABASE db_cidade_dos_vegetais;

-- Conectar com o banco de dados db_generation_game_online.
USE db_cidade_dos_vegetais;

-- Crie a tabela tb_categorias e determine pelo menos 2 atributos, além da Chave Primária, relevantes para classificar os produtos.
CREATE TABLE tb_categorias(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(200)
);

-- Crie a tabela tb_produtos e determine 4 atributos, além da Chave Primária, relevantes aos produtos da farmácia.
CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    categoria_id BIGINT,
    preco DECIMAL(6,2),
    nome VARCHAR(200),
    FOREIGN KEY (categoria_id) REFERENCES tb_produtos(id) -- Não esqueça de criar a Foreign Key da tabela tb_categorias na tabela tb_produtos.
);

-- Insira 5 registros na tabela tb_categorias.
INSERT INTO tb_categorias (descricao) VALUES ("Fruta");
INSERT INTO tb_categorias (descricao) VALUES ("Raízes");
INSERT INTO tb_categorias (descricao) VALUES ("Leguminosas");
INSERT INTO tb_categorias (descricao) VALUES ("Bulbos");
INSERT INTO tb_categorias (descricao) VALUES ("Cereais");

-- Validar se os dados foram inseridos na tabela tb_classes
SELECT * FROM tb_categorias;

-- Insira 8 registros na tabela tb_produtos, preenchendo a Chave Estrangeira para criar a relação com a tabela tb_categorias.
INSERT INTO tb_produtos(categoria_id, preco, nome) VALUES (1, 4.50, "Tomate");
INSERT INTO tb_produtos(categoria_id, preco, nome) VALUES (1, 5.99, "Maça");
INSERT INTO tb_produtos(categoria_id, preco, nome) VALUES (1, 7.57, "Pepino");
INSERT INTO tb_produtos(categoria_id, preco, nome) VALUES (2, 15.00, "Mandioca");
INSERT INTO tb_produtos(categoria_id, preco, nome) VALUES (2, 8.53, "Beterraba");
INSERT INTO tb_produtos(categoria_id, preco, nome) VALUES (3, 15.85, "Feijão");
INSERT INTO tb_produtos(categoria_id, preco, nome) VALUES (4, 25.45, "Cebola");
INSERT INTO tb_produtos(categoria_id, preco, nome) VALUES (5, 9.35, "Arroz");

-- Validar se os dados foram inseridos na tabela tb_classes
SELECT * FROM tb_produtos;

-- Faça um SELECT que retorne todes os produtos cujo valor seja maior do que R$ 10,00.
SELECT * FROM tb_produtos WHERE preco > 10.00;

-- Faça um SELECT que retorne todes os produtos cujo valor esteja no intervalo R$ 10,00 e R$ 50,00.
SELECT * FROM tb_produtos WHERE preco BETWEEN 10.00 AND 50.00;

-- Faça um SELECT utilizando o operador LIKE, buscando todes os produtos que possuam a letra C no atributo nome.
SELECT * FROM tb_produtos WHERE nome LIKE "%c%";

-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_produtos com os dados da tabela tb_categorias.
SELECT a.preco, a.nome, a.categoria_id,
	b.descricao
FROM tb_produtos a
INNER JOIN tb_categorias b ON a.categoria_id = b.id;

-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_produtos com os dados da tabela tb_categorias, 
-- onde traga apenas os produtos que pertençam a uma categoria específica (Exemplo: Todes os produtos que pertencem a categoria aves ou frutas).
SELECT a.preco, a.nome, a.categoria_id,
	b.descricao
FROM tb_produtos a
INNER JOIN tb_categorias b ON a.categoria_id = b.id
WHERE b.id = 1;