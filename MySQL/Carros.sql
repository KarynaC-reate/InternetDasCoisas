CREATE DATABASE db_concessionaria;
USE db_concessionaria;

CREATE TABLE Carros(
    id INT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(50),
    ano VARCHAR(50),
    tipo VARCHAR(50),
    portas VARCHAR(50)
)AUTO_INCREMENT=1;

SELECT * FROM Carros; 