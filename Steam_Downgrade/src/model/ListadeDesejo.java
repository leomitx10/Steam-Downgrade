package model;

import static interface_grafica.Tela_ListaDesejo.listadejogos;
import static interface_grafica.Tela_ListaDesejo.selExc;
import static interface_grafica.Tela_ListaDesejo.jLabel2;
import static interface_grafica.Tela_ListaDesejo.jLabel3;
import static interface_grafica.Tela_ListaDesejo.jLabel4;
import static interface_grafica.Tela_ListaDesejo.jLabel5;
import static interface_grafica.Tela_ListaDesejo.jLabel12;
import static interface_grafica.Tela_ListaDesejo.jLabel14;
import static interface_grafica.Tela_ListaDesejo.jLabel16;
import static interface_grafica.Tela_ListaDesejo.jLabel10;
import static interface_grafica.Tela_ListaDesejo.jLabel11;
import static interface_grafica.Tela_ListaDesejo.jLabel13;
import static interface_grafica.Tela_ListaDesejo.jLabel15;
import static interface_grafica.Tela_ListaDesejo.jLabel17;
import static interface_grafica.Tela_ListaDesejo.jLabel18;
import static interface_grafica.Tela_ListaDesejo.jLabel19;
import static interface_grafica.Tela_ListaDesejo.jLabel20;
import static interface_grafica.Tela_ListaDesejo.jLabel21;
import static interface_grafica.Tela_ListaDesejo.jLabel6;
import static interface_grafica.Tela_ListaDesejo.jLabel7;
import static interface_grafica.Tela_ListaDesejo.jLabel8;
import static interface_grafica.Tela_ListaDesejo.jLabel9;


public class ListadeDesejo{
    
public static boolean verifica(int x){
    if(listadejogos.size()>x){
        return true;
    }else{
        return false;
    }
}

public static void removerdalista(){
    /*olha a opção escolhida e a quantidade de elementos e remove*/
    String escolha= selExc.getSelectedItem().toString(); 
    
        System.out.println(escolha);
        if(escolha.equals("Jogo 1")&& listadejogos.size()>=1){
            listadejogos.remove(0);
        }else if (escolha.equals("Jogo 2")&& listadejogos.size()>=2){
            listadejogos.remove(1);
        }else if(escolha.equals("Jogo 3")&& listadejogos.size()>=3){
            listadejogos.remove(2);
        }else if(escolha.equals("Jogo 4")&& listadejogos.size()>=4){
            listadejogos.remove(3);
        }

        else if(escolha.equals("Jogo 5")&& listadejogos.size()>=5){
            listadejogos.remove(4);
        }
        else if(escolha.equals("Jogo 6")&& listadejogos.size()>=6){
            listadejogos.remove(5);
        }
        else if(escolha.equals("Jogo 7")&& listadejogos.size()>=7){
            listadejogos.remove(6);
        }
        else if(escolha.equals("Jogo 8")&& listadejogos.size()>=8){
            listadejogos.remove(7);
        }
        else if(escolha.equals("Jogo 9")&& listadejogos.size()>=9){
            listadejogos.remove(8);
        }
        else if(escolha.equals("Jogo 10")&& listadejogos.size()>=10){
            listadejogos.remove(9);
        }
}
    
public static void mostrarlista(){
    /*verifica a quantidade de elementos e mostra na lista de desejo*/
    if(listadejogos.isEmpty()){

        }else{jLabel2.setText(listadejogos.get(0).getNome());
            jLabel6.setText(Float.toString(listadejogos.get(0).getValor()));
            
        }

        if(ListadeDesejo.verifica(1)){
            jLabel3.setText(listadejogos.get(1).getNome());
            jLabel7.setText(Float.toString(listadejogos.get(1).getValor()));
            
        }

        if(ListadeDesejo.verifica(2)){
            jLabel4.setText(listadejogos.get(2).getNome());
            jLabel8.setText(Float.toString(listadejogos.get(2).getValor()));
            
        }

        if(ListadeDesejo.verifica(3)){
            jLabel5.setText(listadejogos.get(3).getNome());
            jLabel9.setText(Float.toString(listadejogos.get(3).getValor()));
            
        }
        if(ListadeDesejo.verifica(4)){
            jLabel12.setText(listadejogos.get(4).getNome());
            jLabel13.setText(Float.toString(listadejogos.get(4).getValor()));
            
        }
        if(ListadeDesejo.verifica(5)){
            jLabel14.setText(listadejogos.get(5).getNome());
            jLabel15.setText(Float.toString(listadejogos.get(5).getValor()));
            
        }
        if(ListadeDesejo.verifica(6)){
            jLabel16.setText(listadejogos.get(6).getNome());
            jLabel17.setText(Float.toString(listadejogos.get(6).getValor()));
            
        }
        if(ListadeDesejo.verifica(7)){
            jLabel10.setText(listadejogos.get(7).getNome());
            jLabel11.setText(Float.toString(listadejogos.get(7).getValor()));
            
        }
        if(ListadeDesejo.verifica(8)){
            jLabel18.setText(listadejogos.get(8).getNome());
            jLabel19.setText(Float.toString(listadejogos.get(8).getValor()));
            
        }
        if(ListadeDesejo.verifica(9)){
            jLabel20.setText(listadejogos.get(9).getNome());
            jLabel21.setText(Float.toString(listadejogos.get(9).getValor()));
            
        }
}


}

