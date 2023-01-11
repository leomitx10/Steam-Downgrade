/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import teste.Jogo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author artur
 */
public class JogoDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarJogo(Jogo objjogo){
        String sql = "INSERT INTO jogos(nome,desenvolvedor,distribuidora,requisitos,genero,descricao,valor,classificacaoindicativa) VALUES (?,?,?,?,?,?,?,?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objjogo.getNome());
             pstm.setString(2, objjogo.getDesenvolvedor());
                pstm.setString(3,objjogo.getDistribuidora());
                pstm.setString(4, objjogo.getRequisitos());
                pstm.setString(5,objjogo.getGenero());
                pstm.setString(6, objjogo.getDescricao());
                pstm.setFloat(7, objjogo.getValor());
                pstm.setInt(8, objjogo.getClassificacao_Indicativa());
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
        }
    }
    
    
}
