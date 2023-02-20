package model;

import Controle.ImagemDAO;
import Controle.ManipularImagem;
import static interface_grafica.Tela_Loja2.labelimagem1;
import static interface_grafica.Tela_Loja2.labelimagem2;
import static interface_grafica.Tela_Loja2.labelimagem3;
import static interface_grafica.Tela_Loja2.labelimagem4;
import static interface_grafica.Tela_Loja2.labelimagem5;
import static interface_grafica.Tela_Loja2.labelimagem6;


public class Loja {
   /*Coloca a imagem do jogo*/
    public static void MostrarCapaJogo(){
        int id = 1;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), labelimagem1); 
        
        int id1 = 2;
        ImagemDAO dao1 = new ImagemDAO();
        Imagem exe1 = dao1.buscar(id1);
        ManipularImagem.exibiImagemLabel(exe1.getImagem(), labelimagem2);
        
        int id2 = 3;
        ImagemDAO dao2 = new ImagemDAO();
        Imagem exe2 = dao2.buscar(id2);
        ManipularImagem.exibiImagemLabel(exe2.getImagem(), labelimagem3); 
        
        int id3 = 4;
        ImagemDAO dao3 = new ImagemDAO();
        Imagem exe3 = dao3.buscar(id3);
        ManipularImagem.exibiImagemLabel(exe3.getImagem(), labelimagem4); 
        
        int id4 = 5;
        ImagemDAO dao4 = new ImagemDAO();
        Imagem exe4 = dao4.buscar(id4);
        ManipularImagem.exibiImagemLabel(exe4.getImagem(), labelimagem5); 
        
        int id5 = 6;
        ImagemDAO dao5 = new ImagemDAO();
        Imagem exe5 = dao5.buscar(id5);
        ManipularImagem.exibiImagemLabel(exe5.getImagem(), labelimagem6); 
    }
    
    
    
}    
