-- Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as informações dos estudantes deste registro dessa escola.
CREATE DATABASE db_escola;

-- Conectar com o banco de dados RH
USE db_escola;

-- Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos relevantes dos estudantes para se trabalhar com o serviço dessa escola.
CREATE TABLE tb_estudante(
	id_estudante int auto_increment primary key,
    nome_estudante varchar(150),
    idade_estudante int(2),
    curso_estudante varchar(100),
    nota_estudante decimal(4,2)
);

-- Visualiar a tabela criada.
SELECT * FROM tb_estudante;

-- Insira nesta tabela no mínimo 8 dados (registros).
INSERT INTO tb_estudante (nome_estudante, idade_estudante, curso_estudante, nota_estudante) VALUES ('Bruna', 30, 'INFORMATICA', 8);
INSERT INTO tb_estudante (nome_estudante, idade_estudante, curso_estudante, nota_estudante) VALUES ('Bruno', 32, 'INFORMATICA', 8.5);
INSERT INTO tb_estudante (nome_estudante, idade_estudante, curso_estudante, nota_estudante) VALUES ('Beatriz', 28, 'INFORMATICA', 7);
INSERT INTO tb_estudante (nome_estudante, idade_estudante, curso_estudante, nota_estudante) VALUES ('Tob', 21, 'INFORMATICA', 5.75);
INSERT INTO tb_estudante (nome_estudante, idade_estudante, curso_estudante, nota_estudante) VALUES ('Luis', 25, 'INFORMATICA', 6.75);
INSERT INTO tb_estudante (nome_estudante, idade_estudante, curso_estudante, nota_estudante) VALUES ('Paula', 30, 'INFORMATICA', 9);
INSERT INTO tb_estudante (nome_estudante, idade_estudante, curso_estudante, nota_estudante) VALUES ('Whisky', 8, 'INFORMATICA', 9.55);
INSERT INTO tb_estudante (nome_estudante, idade_estudante, curso_estudante, nota_estudante) VALUES ('Brunce', 14, 'INFORMATICA', 10);

-- Visualizar se os campos foram criados.
SELECT * FROM tb_estudante;

-- Ao término atualize um registro desta tabela através de uma query de atualização.
UPDATE tb_estudante SET nota_estudante = 8.0 WHERE id_estudante = 4;