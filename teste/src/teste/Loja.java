package teste;

import java.util.ArrayList;

public class Loja {
    private String ofertas;
    private ArrayList<Jogo>Jogo;
    private Jogo game;
    private ListadeDesejo listadeDesejo;
    private Carrinho carrinho;
    private Ajuda ajuda;

    public Loja(String ofertas, ArrayList<Jogo> Jogo, Jogo game, ListadeDesejo listadeDesejo, Carrinho carrinho, Ajuda ajuda) {
        this.ofertas = ofertas;
        this.Jogo = Jogo;
        this.game = game;
        this.listadeDesejo = listadeDesejo;
        this.carrinho = carrinho;
        this.ajuda = ajuda;
    }

    public String getOfertas() {
        return ofertas;
    }

    public void setOfertas(String ofertas) {
        this.ofertas = ofertas;
    }

    public ArrayList<Jogo> getJogo() {
        return Jogo;
    }

    public void setJogo(ArrayList<Jogo> Jogo) {
        this.Jogo = Jogo;
    }

    public Jogo getGame() {
        return game;
    }

    public void setGame(Jogo game) {
        this.game = game;
    }

    public ListadeDesejo getListadeDesejo() {
        return listadeDesejo;
    }

    public void setListadeDesejo(ListadeDesejo listadeDesejo) {
        this.listadeDesejo = listadeDesejo;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public Ajuda getAjuda() {
        return ajuda;
    }

    public void setAjuda(Ajuda ajuda) {
        this.ajuda = ajuda;
    }

    
    
    
}    