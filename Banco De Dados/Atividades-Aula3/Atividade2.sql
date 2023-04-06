-- Crie um banco de dados para um e-commerce, onde o sistema trabalhará com as informações dos produtos deste e-commerce. 
CREATE DATABASE db_ecommerce;

-- Conectar com o banco de dados RH
USE db_ecommerce;

-- Crie uma tabela de produtos e determine 5 atributos relevantes dos produtos para se trabalhar com o serviço deste e-commerce.
CREATE TABLE tb_produtos(
	id_produto bigint auto_increment primary key,
    nome_produto varchar(200),
    codigo_produto int(50),
    preco_produto decimal (10,2),
    quantidade_produto int(100)
);

-- Visualiar a tabela criada
SELECT * FROM tb_produtos;

-- Insira nesta tabela no mínimo 8 dados (registros).liquidificador
INSERT INTO tb_produtos (nome_produto, codigo_produto, preco_produto, quantidade_produto) VALUES ('BATEDEIRA', 123, 250.00, 10);
INSERT INTO tb_produtos (nome_produto, codigo_produto, preco_produto, quantidade_produto) VALUES ('LIDIFICADOR', 456, 300.00, 5);
INSERT INTO tb_produtos (nome_produto, codigo_produto, preco_produto, quantidade_produto) VALUES ('GELADEIRA', 789, 3457.58, 8);
INSERT INTO tb_produtos (nome_produto, codigo_produto, preco_produto, quantidade_produto) VALUES ('PANELA ELETRICA', 987, 156.87, 20);
INSERT INTO tb_produtos (nome_produto, codigo_produto, preco_produto, quantidade_produto) VALUES ('MIX', 654, 178.58, 50);
INSERT INTO tb_produtos (nome_produto, codigo_produto, preco_produto, quantidade_produto) VALUES ('MICROONDAS', 321, 675.48, 15);
INSERT INTO tb_produtos (nome_produto, codigo_produto, preco_produto, quantidade_produto) VALUES ('FERRO DE PASSAR ROUPA', 159, 124.58, 6);
INSERT INTO tb_produtos (nome_produto, codigo_produto, preco_produto, quantidade_produto) VALUES ('MAQUINA DE LAVAR', 753, 5864.99, 3);

-- Visualizar se os campos foram criados
SELECT * FROM tb_produtos;

-- Faça um SELECT que retorne todes os produtos com o valor maior do que 500.
SELECT * FROM tb_produtos WHERE preco_produto > 500;

-- Faça um SELECT que retorne todes os produtos com o valor menor do que 500.
SELECT * FROM tb_produtos WHERE preco_produto < 500;

-- Ao término atualize um registro desta tabela através de uma query de atualização.
UPDATE tb_produtos SET nome_produto = 'LIQUIDIFICADOR' WHERE id_produto = 2;
