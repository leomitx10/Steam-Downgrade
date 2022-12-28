package teste;
public class Cliente extends Usuario {
    private float saldo;
    private Pedido pedido;
    
    public Cliente(float saldo) {
        this.saldo = saldo;
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
    
    
    public void adicionarCarrinho(){
    }
    
    public void adicionarLista(){
    }
    
}
