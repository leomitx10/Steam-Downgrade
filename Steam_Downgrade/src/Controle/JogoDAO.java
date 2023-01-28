/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import model.Jogo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Usuario;
import com.mysql.cj.jdbc.result.ResultSetFactory;
import java.util.Date;

/**
 *
 * @author artur
 */
public class JogoDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    private final ArrayList<Jogo> lista = new ArrayList<>();
    
    public void cadastrarJogo(Jogo objjogo){
        String sql = "INSERT INTO jogos(nome,desenvolvedor,distribuidora,requisitos,genero,descricao,valor,classificacaoindicativa) VALUES (?,?,?,?,?,?,?,?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,objjogo.getNome());
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
    
   public ArrayList<Jogo>  listJogos() {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "SELECT * FROM jogos";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                
                String nome = rs.getString("nome");
                Float valor = rs.getFloat("valor");
                int classificacaoindicativa=rs.getInt("classificacaoindicativa");
                String desenvolvedor = rs.getString("desenvolvedor");
                String distribuidora = rs.getString("distribuidora");
                String requisitos = rs.getString("requisitos");
                String genero = rs.getString("genero");
                String descricao = rs.getString("descricao");
                int id = rs.getInt("id");
                   
                Jogo objjogo = new Jogo(nome,valor,classificacaoindicativa,desenvolvedor,distribuidora,requisitos,genero,descricao);
                objjogo.setId(id);
                lista.add(objjogo);
            }
        } catch(SQLException error) {
            System.out.println("Error: " + error);
        }
        
        return lista;
    }
    
   
}
