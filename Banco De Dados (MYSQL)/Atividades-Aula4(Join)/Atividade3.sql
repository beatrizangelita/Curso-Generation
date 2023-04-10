-- Crie um banco de dados para um serviço de uma Farmácia. 
-- O nome do Banco de dados deverá ter o seguinte nome db_farmacia_bem_estar. 
-- O sistema trabalhará com as informações dos produtos comercializados pela empresa. 
-- O sistema trabalhará com 2 tabelas tb_produtos e tb_categorias, que deverão estar relacionadas.

-- Criar banco de dados db_pizzaria_legal.
CREATE DATABASE db_farmacia_bem_estar;

-- Conectar com o banco de dados db_generation_game_online.
USE db_farmacia_bem_estar;

-- Crie a tabela tb_categorias e determine pelo menos 2 atributos, além da Chave Primária, relevantes para classificar os produtos.
CREATE TABLE tb_categorias(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR (200)
);

-- Crie a tabela tb_produtos e determine 4 atributos, além da Chave Primária, relevantes aos produtos da farmácia.
CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    categoria_id BIGINT,
    nome VARCHAR (200),
    codigo_barra VARCHAR(200),
    preco DECIMAL(6,2),
    setor VARCHAR(200),
    FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
);

-- Insira 5 registros na tabela tb_categorias.
INSERT INTO tb_categorias(descricao) VALUES ("Beleza");
INSERT INTO tb_categorias(descricao) VALUES ("Medicamentos");
INSERT INTO tb_categorias(descricao) VALUES ("Higiene Pessoal");
INSERT INTO tb_categorias(descricao) VALUES ("Vida Saudavel");
INSERT INTO tb_categorias(descricao) VALUES ("Cabelo");

-- Validar se os dados foram inseridos na tabela tb_classes
SELECT * FROM tb_categorias;

-- Insira 8 registros na tabela tb_produtos, preenchendo a Chave Estrangeira para criar a relação com a tabela tb_categorias.
INSERT INTO tb_produtos(categoria_id, nome, codigo_barra, preco, setor) VALUES (1, "Eau De Lacoste", 123, 308.40, "Perfume");
INSERT INTO tb_produtos(categoria_id, nome, codigo_barra, preco, setor) VALUES (2, "Seringa", 456, 3.09, "Tratamento Em Casa");
INSERT INTO tb_produtos(categoria_id, nome, codigo_barra, preco, setor) VALUES (2, "Kit Mascara", 789, 64.40, "Tratamento Em Casa");
INSERT INTO tb_produtos(categoria_id, nome, codigo_barra, preco, setor) VALUES (2, "Inalador", 357, 299.99, "Tratamento Em Casa");
INSERT INTO tb_produtos(categoria_id, nome, codigo_barra, preco, setor) VALUES (3, "Escova de Dente", 159, 25.85, "Higiene Bucal");
INSERT INTO tb_produtos(categoria_id, nome, codigo_barra, preco, setor) VALUES (4, "Vitamina D", 576, 27.99, "Vitaminas");
INSERT INTO tb_produtos(categoria_id, nome, codigo_barra, preco, setor) VALUES (5, "Agua Oxigenada", 951, 2.49, "Tinturas");
INSERT INTO tb_produtos(categoria_id, nome, codigo_barra, preco, setor) VALUES (5, "Imecap", 753, 27.49, "Tratamento Capilar");

-- Validar se os dados foram inseridos na tabela tb_classes
SELECT * FROM tb_produtos;

-- Faça um SELECT que retorne todes os produtos cujo valor seja maior do que R$ 50,00.
SELECT * FROM tb_produtos WHERE preco > 50.00;

-- Faça um SELECT que retorne todes os produtos cujo valor esteja no intervalo R$ 5,00 e R$ 60,00.
SELECT * FROM tb_produtos WHERE preco BETWEEN 5.00 AND 60.00;

-- Faça um SELECT utilizando o operador LIKE, buscando todes os produtos que possuam a letra C no atributo nome.
SELECT * FROM tb_produtos WHERE nome LIKE "%i%";

-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_produtos com os dados da tabela tb_categorias.
SELECT a.nome, a.codigo_barra, a.preco, a.setor,
	b.descricao
FROM tb_produtos a 
INNER JOIN tb_categorias b ON a.categoria_id = b.id;

-- Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_produtos com os dados da tabela tb_categorias, 
-- onde traga apenas os produtos que pertençam a uma categoria específica (Exemplo: Todes os produtos que pertencem a categoria cosméticos).
SELECT a.nome, a.codigo_barra, a.preco, a.setor,
	b.descricao
FROM tb_produtos a 
INNER JOIN tb_categorias b ON a.categoria_id = b.id
WHERE b.id = 3;