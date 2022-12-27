package teste;
import java.util.ArrayList;
public class Carrinho {
    private ArrayList<Jogo> Jogo;

    public Carrinho(ArrayList<Jogo> Jogo) {
        this.Jogo = Jogo;
    }

    public ArrayList<Jogo> getJogo() {
        return Jogo;
    }

    public void setJogo(ArrayList<Jogo> Jogo) {
        this.Jogo = Jogo;
    }
    
    public void removerCarrinho(){
    }
    
    public void verDetalherCarrinho(){
    }
    
}
