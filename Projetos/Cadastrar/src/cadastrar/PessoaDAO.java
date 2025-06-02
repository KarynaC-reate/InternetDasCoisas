package cadastrar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PessoaDAO {
    private final Connection connection;
    
    public PessoaDAO(){     
        this.connection = new ConnectonFactory().conectaBD();
    }
    
    public void criarPessoa(Pessoa pessoa) throws SQLException{
        String sql = "INSERT INTO tb_pessoa(nome,email,"
                + "idade,sexo)VALUES(?,?,?,?)";
       
        PreparedStatement pstmt = null;
        ResultSet rs = null;
       
        try{
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, pessoa.getNome());
            pstmt.setString(1, pessoa.getEmail());
            pstmt.setString(2, pessoa.getIdade());
            pstmt.setString(3, pessoa.getSexo());

            pstmt.executeUpdate();
            System.out.println("Deu certo. ");
        }catch(SQLException e){
            System.out.println("Deu errado. " +e.getMessage());
           
        }
        finally{
            if(rs !=null) rs.close();
            if(pstmt !=null) pstmt.close();           
            }
        }
      
}
