/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import static interface_grafica.Tela_Usuario.txtPassword;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Jogo;

/**
 *
 * @author artur
 */
public class BibliotecaDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    /*A função mandabilioteca insere os jogos na tabela criada no mysql chamada jogos_comprados*/
    public void mandarbiblioteca(Jogo objjogo){
        String sql = "INSERT INTO jogos_comprados(senha,nome,valor,id) VALUES (?,?,?,?)";/*comando q vai ser executado no mysql */
        
        
        conn = new ConexaoDAO().conectaBD();/*faz a conexao com o mysql*/
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, txtPassword.getText()); 
            pstm.setString(2, objjogo.getNome());
            pstm.setFloat(3, objjogo.getValor());
            pstm.setInt(4,objjogo.getId());
            pstm.execute();
            pstm.close();
        } catch (Exception erro) { 
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
        }
    }
}
