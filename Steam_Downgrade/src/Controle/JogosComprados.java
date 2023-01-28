/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Jogo;
/**
 *
 * @author leandro
 */
public class JogosComprados {
    
    Connection conn;
    PreparedStatement rue;
    ResultSet rs;
    ArrayList<Jogo> listacomprados = new ArrayList<>();
    
    //Pega as compras cadastradas com a senha do usuario e exibe em forma de tabela 
    public ArrayList<Jogo>ListaComprasJogos(String JogoAserListado){
        
        String sql = "select * from jogos_comprados where senha = ? ";
        conn = new ConexaoDAO().conectaBD();
        
        try {
           
            rue = conn.prepareStatement(sql);
            rue.setString(1, JogoAserListado);
            
            rs = rue.executeQuery();
                
            while(rs.next()){
                
                Jogo novo = new Jogo("",0f,0,"","","","","");
                novo.setNome(rs.getString("nome"));
                novo.setValor(rs.getFloat("valor"));
                novo.setId(rs.getInt("id"));
                
                listacomprados.add(novo);  
            }

        } catch (SQLException erro) {
        
        JOptionPane.showMessageDialog(null, "Lista Compras " + erro.getMessage());
        
        }
        
        
          return listacomprados; 
        
    }
    
}
