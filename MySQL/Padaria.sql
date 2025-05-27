CREATE DATABASE padaria;
USE padaria;

CREATE TABLE tb_comidas(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    preco VARCHAR(100),
    tipo VARCHAR(50)

)AUTO_INCREMENT=1;

SELECT * FROM tb_comidas;