/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author artur
 */
public class UsuarioDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarUsuario(Usuario objusuariodto){
        String sql = "insert into usuarios (nome, idade, apelido, endereco, cpf, email, senha) values (?,?,?,?,?,?,?)";
        /*coloca as infos do usuario na tebala usuarios*/
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getNome());
            pstm.setInt(2, objusuariodto.getIdade());
            pstm.setString(3, objusuariodto.getApelido());
            pstm.setString(4, objusuariodto.getEndereco());
            pstm.setString(5, objusuariodto.getCpf());
            pstm.setString(6, objusuariodto.getEmail());
            pstm.setString(7, objusuariodto.getSenha());
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
        }
    }
}
