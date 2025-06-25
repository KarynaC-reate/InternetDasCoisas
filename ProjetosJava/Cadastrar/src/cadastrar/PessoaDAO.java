package cadastrar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {
    private final Connection connection;
    
    public PessoaDAO(){     
        this.connection = new ConnectonFactory().conectaBD();
    }
    
    //create
    public void criarPessoa(Pessoa pessoa) throws SQLException{
        String sql = "INSERT INTO tb_pessoa(nome,email,"
                + "idade,sexo)VALUES(?,?,?,?)";
       
        PreparedStatement pstmt = null;
        ResultSet rs = null;
       
        try{
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, pessoa.getNome());
            pstmt.setString(2, pessoa.getEmail());
            pstmt.setString(3, pessoa.getIdade());
            pstmt.setString(4, pessoa.getSexo());

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
      
    //listar usuarios
    public List<Pessoa> listarPessoas()throws SQLException{
        List<Pessoa> lista = new ArrayList<>();
        String sql = "SELECT * FROM tb_pessoa";
        
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try{
            pstm = connection.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()){
                Pessoa pessoa = new Pessoa(0,"","","","");
                pessoa.setId(rs.getInt("Id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setEmail(rs.getString("email"));
                pessoa.setIdade(rs.getString("idade"));                   
                pessoa.setSexo(rs.getString("sexo"));
            
                lista.add(pessoa);
        }
        }catch (SQLException k){
                System.out.println("Erro" +k.getMessage());
        }
        finally{
            if(rs !=null) rs.close();
            if(pstm !=null) pstm.close();
            }
            return lista;
        }    
    
    //buscar por id
    public Pessoa buscarPessoaPorId(int id) throws SQLException{
        String sql = "SELECT * FROM tb_pessoa WHERE id=?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Pessoa pessoa = null;
        
        try{
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            
            if(rs.next()){
                pessoa = new Pessoa(0,"","","","");
                pessoa.setId(rs.getInt("Id"));
                pessoa.setNome(rs.getString("Nome"));
                pessoa.setEmail(rs.getString("Email"));
                pessoa.setIdade(rs.getString("Idade"));
                pessoa.setSexo(rs.getString("Sexo"));
                
            }
        }catch (SQLException e){
            System.out.println("Deu errado: ");
        }finally{
            if(rs !=null)rs.close();
            if(pstmt !=null)pstmt.close();
        }
        return pessoa;
    }       
    
    //DELETE
    public void deletarPessoa(int id) throws SQLException {
        String sql = "DELETE FROM tb_pessoa WHERE id = ?";
        
        try (Connection conn = ConnectonFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql)) {
            
            pstm.setInt(1, id);
            int linhasAfetadas = pstm.executeUpdate();
            
            if (linhasAfetadas > 0) {
                System.out.println("Pessoa deletada com sucesso! ");
            }else {
                System.out.println("Nenhuma pessoa encontrada com o ID informado. ");
            }
            
        }catch (SQLException e) {
            System.out.println("Erro ao deletar pessoa: " + e.getMessage());
        }
    }
    
    //UPDATE 
    public void atualizarPessoa(Pessoa pessoa) throws SQLException {
        String sql = "UPDATE tb_pessoa SET nome = ?, email = ?, idade = ?, sexo = ? WHERE id = ?";
        
        try(Connection conn = ConnectonFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getEmail());
            stmt.setString(3, pessoa.getIdade());
            stmt.setString(4, pessoa.getSexo());
            stmt.setInt(5, pessoa.getId());
            stmt.executeUpdate();
            
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Pessoa atualizada com sucesso. ");
            }else{
                System.out.println("Pessoa com ID nao encontrado. ");
            }
        }catch (SQLException e) {
            System.out.println("Erro ao atualizar pessoa: " + e.getMessage());
        }
    }
}
