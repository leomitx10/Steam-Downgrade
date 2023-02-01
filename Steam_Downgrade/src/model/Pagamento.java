package model;

import Controle.BibliotecaDAO;
import static interface_grafica.Carrinho.listadejogos;
import static interface_grafica.Tela_Biblioteca.listabiblioteca;
import static interface_grafica.Tela_PagamentoB.biblioteca;
import static interface_grafica.Tela_PagamentoB.carrinho;
import static interface_grafica.Tela_Usuario.txtPassword;
import java.util.ArrayList;

public class Pagamento {
    
    public static boolean verifica(int x){
        if(listadejogos.size()>x){
            return true;
        }else{
            return false;
        }
    }
    
    public static void MandaJogoBiblioteca(){
        /*manda o jogo do carrinho para a biblioteca*/
        if(listadejogos.isEmpty()){
            
        }else{
            biblioteca.listabiblioteca.add(listadejogos.get(0));
        }
        
        if(verifica(1)){
            biblioteca.listabiblioteca.add(listadejogos.get(1));
        }
        
        if(verifica(2)){
           biblioteca.listabiblioteca.add(listadejogos.get(2));
        }
        
        if(verifica(3)){
             biblioteca.listabiblioteca.add(listadejogos.get(3));
        }
        
        if(verifica(4)){
             biblioteca.listabiblioteca.add(listadejogos.get(4));
        }
        
        if(verifica(5)){
             biblioteca.listabiblioteca.add(listadejogos.get(5));
        }
        
        if(verifica(6)){
             biblioteca.listabiblioteca.add(listadejogos.get(6));
        }
        
        if(verifica(7)){
             biblioteca.listabiblioteca.add(listadejogos.get(7));
        }
        if(verifica(8)){
             biblioteca.listabiblioteca.add(listadejogos.get(8));
        }
        if(verifica(9)){
             biblioteca.listabiblioteca.add(listadejogos.get(9));
        }
        System.out.println("jogos comprados: "+biblioteca.listabiblioteca.size());
        
        carrinho.listadejogos.clear();
        
        for(int i=0;i<listabiblioteca.size();i++){
            /*coloca o jogo na biblioteca*/
            String senha = txtPassword.getText();
            String nome = listabiblioteca.get(i).getNome();
            float valor = listabiblioteca.get(i).getValor();
            int id = listabiblioteca.get(i).getId();
            
            Jogo objjogo = new Jogo(nome,valor,0,"","","","","");
            objjogo.setSenha(senha);
            objjogo.setId(id);
            
            BibliotecaDAO objusuariodao = new BibliotecaDAO();
            objusuariodao.mandarbiblioteca(objjogo);
            
        }
    }
	
}
