CREATE DATABASE cadastrar;
USE cadastrar;

CREATE TABLE tb_pessoa(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    idade VARCHAR(20),
    sexo VARCHAR(20)

)AUTO_INCREMENT=1;

SELECT * FROM tb_pessoa;
