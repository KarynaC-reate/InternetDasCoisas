package cinema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection conectaBD(){
        Connection conn = null;
        
        try{
            String url = "jdbc:mysql://localhost:3306/cinema?useSSL=false";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        }catch (SQLException erro){
            System.out.println("Erro " +erro.getMessage());
        }
        return conn;
    }
    
    //CONFIGURAÇÕES DA CONEXÃO COM O BANCO DE DADOS
    private static final String URL = "jdbc:mysql://localhost:3306/cinema?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
