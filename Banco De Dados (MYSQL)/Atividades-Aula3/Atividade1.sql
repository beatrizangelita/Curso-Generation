-- Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema trabalhará com as informações dos colaboradores desta empresa. 
CREATE DATABASE db_rh;

-- Conectar com o banco de dados RH
USE db_rh;

-- Crie uma tabela de colaboradores e determine 5 atributos relevantes dos colaboradores para se trabalhar com o serviço deste RH.
CREATE TABLE tb_colaboradores(
	id_colaborador bigint auto_increment primary key, 
    nome_colaborador varchar(50),
    idade int(2),
    salario_colaborador decimal(6,2),
    cargo varchar(50)
);

-- -- Visualiar a tabela criada.
SELECT * FROM tb_colaboradores;

-- Insira nesta tabela no mínimo 5 dados (registros).
INSERT INTO tb_colaboradores(nome_colaborador, idade, salario_colaborador, cargo) VALUES ('Beatriz', 27, 150.00, 'Desenvolvedora');
INSERT INTO tb_colaboradores(nome_colaborador, idade, salario_colaborador, cargo) VALUES ('Bruna', 30, 400.00, 'Financeiro');
INSERT INTO tb_colaboradores(nome_colaborador, idade, salario_colaborador, cargo) VALUES ('Bruno', 31, 250.00, 'Tecnico');
INSERT INTO tb_colaboradores(nome_colaborador, idade, salario_colaborador, cargo) VALUES ('Ayla', 21, 300.00, 'Auxiliar administrativo');
INSERT INTO tb_colaboradores(nome_colaborador, idade, salario_colaborador, cargo) VALUES ('Whisky', 18, 500.00, 'Segurança');

-- Visualizar se os campos foram criados.
SELECT * FROM tb_colaboradores;

-- Faça um SELECT que retorne todes os colaboradores com o salário maior do que 2000.
SELECT * FROM tb_colaboradores WHERE salario_colaborador > 2000;

-- Faça um SELECT que retorne todes os colaboradores com o salário menor do que 2000.
SELECT * FROM tb_colaboradores WHERE salario_colaborador < 2000;

-- Alterar coluna de salário
ALTER TABLE tb_colaboradores MODIFY COLUMN salario_colaborador DECIMAL (10,2);

-- Ao término atualize um registro desta tabela através de uma query de atualização.
UPDATE tb_colaboradores SET salario_colaborador = 1500.00 WHERE id_colaborador = 1;
UPDATE tb_colaboradores SET salario_colaborador = 4000.00 WHERE id_colaborador = 2;
UPDATE tb_colaboradores SET salario_colaborador = 1500.00 WHERE id_colaborador = 3;
UPDATE tb_colaboradores SET salario_colaborador = 3000.00 WHERE id_colaborador = 4;
UPDATE tb_colaboradores SET salario_colaborador = 1800.00 WHERE id_colaborador = 5;
