package teste;
public class Cliente extends Usuario {
    private float saldo;
<<<<<<< HEAD
    private Pedido pedido;
    
=======
    //construtor
>>>>>>> oscar_teste
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
    
    //metodo
    public void adicionarCarrinho(){
    }
    
    public void adicionarLista(){
    }
    
}
