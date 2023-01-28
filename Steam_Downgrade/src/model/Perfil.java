/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static interface_grafica.Tela_Perfil2.perfil;
import static interface_grafica.Tela_Perfil2.txtApelido;
import static interface_grafica.Tela_Perfil2.txtEmail;
import static interface_grafica.Tela_Perfil2.txtIdade;
import static interface_grafica.Tela_Perfil2.txtNomeUsu;

/**
 *
 * @author leandro
 */
public class Perfil {
    public static void InfoPerfil(){
        if(perfil.isEmpty()){
        
        }else{
            txtApelido.setText(perfil.get(0).getApelido());
            txtNomeUsu.setText(perfil.get(0).getNome());
            txtEmail.setText(perfil.get(0).getEmail());
            txtIdade.setText(Integer.toString(perfil.get(0).getIdade()));
        }
    }
}
