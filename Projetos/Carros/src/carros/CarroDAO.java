package carros;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class CarroDAO {
    private Connection connection;
    
    public CarroDAO(){
        this.connection = new ConnectionFactory().conectaDB();
    }
    
}
