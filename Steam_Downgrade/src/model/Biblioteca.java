package model;
import java.util.ArrayList;

public class Biblioteca{
    // Atributos
    private ArrayList<Jogo> jogo;
    private Jogo game;

    public Biblioteca(ArrayList<Jogo> jogo, Jogo game, int quantidadeJogos){
        this.jogo = jogo;
        this.game = game;
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

 
    
     

    // Metodos
    public void filtrarJogo() {
    }
    
}
