package teste;
public class Cliente extends Usuario {
    private float saldo;
    private Pedido pedido;
    private Carrinho carrinho;
    
    //construtor

    public Cliente(String nome, int idade, String apelido, String cpf, String email, String senha, String endereco) {
        super(nome, idade, apelido, cpf, email, senha, endereco);
    }

    
    

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    //metodo
    public void adicionarCarrinho(){
    }
    
    public void adicionarLista(){
    }
    
}
