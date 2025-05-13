-- DDL
CREATE DATABASE IF NOT EXISTS db_cadastro;
USE db_cadastro;

CREATE TABLE tb_usuarios(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    telefone VARCHAR(50),
    cpf VARCHAR(11),
    idade VARCHAR(3),
    sexo VARCHAR(20),
    tipo_usuario VARCHAR(20)

);
SELECT * FROM tb_usuarios;
