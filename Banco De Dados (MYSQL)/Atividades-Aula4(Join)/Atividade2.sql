-- Crie um banco de dados para um serviço de uma Pizzaria. 
-- O nome do Banco de dados deverá ter o seguinte nome db_pizzaria_legal. 
-- O sistema trabalhará com as informações dos produtos comercializados pela empresa. 
-- O sistema trabalhará com 2 tabelas tb_pizzas e tb_categorias, que deverão estar relacionadas.

-- Criar banco de dados db_pizzaria_legal.
CREATE DATABASE db_pizzaria_legal;

-- Conectar com o banco de dados db_generation_game_online.
USE db_pizzaria_legal;

-- Crie a tabela tb_categorias e determine pelo menos 2 atributos, além da Chave Primária, relevantes para classificar as pizzas.
CREATE TABLE tb_categorias(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR (200),
    tipo INT (2)
);

-- Crie a tabela tb_pizzas e determine 4 atributos, além da Chave Primária, relevantes aos produtos da pizzaria.
CREATE TABLE tb_pizzas(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    categoria_id BIGINT, -- declarando o id da tabela tb_classes
    sabor VARCHAR(200),
    preco DECIMAL(6,2),
    FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id) -- Não esqueça de criar a Foreign Key da tabela tb_categorias na tabela tb_pizzas.
);

-- Insira 5 registros na tabela tb_categorias.
INSERT INTO tb_categorias (descricao, tipo) VALUES ("Pizza",1);
INSERT INTO tb_categorias (descricao, tipo) VALUES ("Esfirra",2);
INSERT INTO tb_categorias (descricao, tipo) VALUES ("Doce",3);
INSERT INTO tb_categorias (descricao, tipo) VALUES ("Salgado",4);
INSERT INTO tb_categorias (descricao, tipo) VALUES ("Bebida",5);

-- Validar se os dados foram inseridos na tabela tb_classes
SELECT * FROM tb_categorias;

-- Insira 8 registros na tabela tb_pizzas, preenchendo a Chave Estrangeira para criar a relação com a tabela tb_categorias.
INSERT INTO tb_pizzas(categoria_id, sabor, preco) VALUES (3,"Banana", 45.00);
INSERT INTO tb_pizzas(categoria_id, sabor, preco) VALUES (3,"Brigadeiro", 26.00);
INSERT INTO tb_pizzas(categoria_id, sabor, preco) VALUES (3,"M&M", 36.00);
INSERT INTO tb_pizzas(categoria_id, sabor, preco) VALUES (1,"Americana", 40.00);
INSERT INTO tb_pizzas(categoria_id, sabor, preco) VALUES (1,"Bacon", 39.00);
INSERT INTO tb_pizzas(categoria_id, sabor, preco) VALUES (1, "Atum", 40.00);
INSERT INTO tb_pizzas(categoria_id, sabor, preco) VALUES (1, "Barbecue", 50.00);
INSERT INTO tb_pizzas(categoria_id, sabor, preco) VALUES (1, "Caipira", 38.00);

-- Validar se os dados foram inseridos na tabela tb_classes
SELECT * FROM tb_pizzas;

-- Faça um SELECT que retorne todas as pizzas cujo valor seja maior do que R$ 45,00.
SELECT * FROM tb_pizzas WHERE preco > 45.00;

-- Faça um SELECT que retorne todas as pizzas cujo valor seja maior do que R$ 45,00.
SELECT * FROM tb_pizzas WHERE preco BETWEEN 50.00 AND 100.00;

-- Faça um SELECT utilizando o operador LIKE, buscando todas as pizzas que possuam a letra M no atributo nome.
SELECT * FROM tb_pizzas WHERE sabor like "%m%";

-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias.
SELECT a.sabor, a.preco,
	b.descricao, b.tipo
FROM tb_pizzas a
INNER JOIN tb_categorias b ON a.categoria_id = b.id;

-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias, 
-- onde traga apenas as pizzas que pertençam a uma categoria específica (Exemplo: Todas as pizzas que são doce).
SELECT a.sabor, a.preco,
	b.descricao, b.tipo
FROM tb_pizzas a
INNER JOIN tb_categorias b ON a.categoria_id = b.id
WHERE b.id = 3;

