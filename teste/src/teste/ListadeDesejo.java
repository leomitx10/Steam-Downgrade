package teste;


public class ListadeDesejo extends ContaJogos {
     private Jogo game;
     private Cliente[] cliente;
    

    //construtor

    public ListadeDesejo(Jogo game, Cliente[] cliente, int quantidadeJogos) {
        super(quantidadeJogos);
        this.game = game;
        this.cliente = cliente;
    }

    
   
   
    //get e set

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
    public void addCarrinho() {
        
    }
	
    public void presentarAmigo() {
		
    }
    
}
