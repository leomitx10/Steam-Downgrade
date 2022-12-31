package teste;

import java.util.ArrayList;

public class Forum {
    private Noticia not;
    private ArrayList<Jogo>Jogo;

    public Forum(Noticia not, ArrayList<Jogo> Jogo) {
        this.not = not;
        this.Jogo = Jogo;
    }
    
    public void adicionarComentario(){
         
    }
    public void removerComentario(){
         
    }

    public Noticia getNot() {
        return not;
    }

    public void setNot(Noticia not) {
        this.not = not;
    }

    public ArrayList<Jogo> getJogo() {
        return Jogo;
    }

    public void setJogo(ArrayList<Jogo> Jogo) {
        this.Jogo = Jogo;
    }
    
    
}
