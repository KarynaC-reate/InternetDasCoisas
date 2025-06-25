//OlaSwing->new->JFrame form-> minhasegundajanela.
package olaswing;
import javax.swing.*;

public class OlaSwing {

    public static void main(String[] args) {
    /*
     JFrame janela = new JFrame("Minha primeira Janela. ");
     janela.setSize(300,200);
     janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     janela.setLayout(null); // layout livre
     
     //criação de botão
     JButton botao = new JButton("Clique aqui. ");
     botao.setBounds(80, 70, 130, 30); //posição x,y, largura, altura
     //ação do botão 
     botao.addActionListener(e -> {
         JOptionPane.showMessageDialog(null, "Ola mundo! ");
         
     });
     //adiciona o botao na janela
     janela.add(botao);
     //torna a janela visível
     janela.setVisible(true);        

    }
    */
    
       Pessoa pess = new Pessoa("Joao ","000 ","M ","123456789-10 ");        
       System.out.println("Nome: "+pess.getNome()+ "CPF: "+pess.getCpf()+ "Sexo: "+pess.getSexo()+ "Endereco "+pess.getEndereco());
       
       pess.setNome("Maria ");  
       pess.setCpf("222222222-22 ");
       pess.setSexo("F ");
       pess.setEndereco("222 ");
       
       System.out.println("Nome: "+pess.getNome()+ "CPF: "+pess.getCpf()+ "Sexo: "+pess.getSexo()+ "Endereco "+pess.getEndereco());

    }          
    
}
