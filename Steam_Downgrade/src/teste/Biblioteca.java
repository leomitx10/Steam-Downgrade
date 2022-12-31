package teste;
import java.util.ArrayList;

public class Biblioteca extends ContaJogos{
    // Atributos
    private ArrayList<Jogo> jogo;
    private Jogo game;
    private Cliente[] cliente;

    public Biblioteca(ArrayList<Jogo> jogo, Jogo game, Cliente[] cliente, int quantidadeJogos) {
        super(quantidadeJogos);
        this.jogo = jogo;
        this.game = game;
        this.cliente = cliente;
    }

    public ArrayList<Jogo> getJogo() {
        return jogo;
    }

    public void setJogo(ArrayList<Jogo> jogo) {
        this.jogo = jogo;
    }

    public Jogo getGame() {
        return game;
    }

    public void setGame(Jogo game) {
        this.game = game;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }
    
     

    // Metodos
    public void filtrarJogo() {
    }
    
}
