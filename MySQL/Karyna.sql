-- DDL
CREATE DATABASE cadastro;
USE cadastro;

CREATE TABLE tb_usuarios(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    telefone VARCHAR(20),
    tipo_usuario VARCHAR(50)

)AUTO_INCREMENT=1;

SELECT * FROM tb_usuarios;
