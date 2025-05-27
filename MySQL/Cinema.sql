CREATE DATABASE cinema;
USE cinema;

CREATE TABLE tb_filmes(
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100),
    genero VARCHAR(100),
    ano VARCHAR(20)

)AUTO_INCREMENT=1;

SELECT * FROM tb_filmes;