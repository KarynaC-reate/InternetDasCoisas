CREATE DATABASE frutas;
USE frutas;

CREATE TABLE tb_fruta(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50),
    quantidade VARCHAR(50),
    maturacao VARCHAR(50),
    local_colhido VARCHAR(50)

)AUTO_INCREMENT=1;

SELECT * FROM tb_fruta;