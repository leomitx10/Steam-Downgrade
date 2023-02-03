/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import com.mysql.cj.jdbc.result.ResultSetFactory;
import com.mysql.cj.protocol.Resultset;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import model.Imagem;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Jogo;


public class ImagemDAO {/*coloca a imagem no banco de dados*/
     
    Connection conn;
    java.sql.PreparedStatement pstm;
    ResultSet rs;
    private final ArrayList<Imagem> lista = new ArrayList<>();
    
    public Boolean inserir(Imagem imagem){
        String sql = "insert into imagens (imagem) values (?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setBytes(1, imagem.getImagem());
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            
            
        }
        return null;
        
    }
    
    public Imagem buscar(Integer endereco ){/*busca a imagem pelo id*/
        Imagem retorno = null;
        
        String sql = "SELECT id,imagem from imagens where id=?";
                
        conn = new ConexaoDAO().conectaBD();

       
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, endereco);
            rs = pstm.executeQuery();
            if(rs.next())
            {
                retorno = new Imagem();
                retorno.setId(rs.getInt("id"));
                retorno.setImagem(rs.getBytes("imagem"));
            
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            retorno = null;
        }
        
        return retorno;
        
    }
    
    
    
}
    

    
    
    
    


    
