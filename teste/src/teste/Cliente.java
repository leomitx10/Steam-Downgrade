package teste;
public class Cliente extends Usuario {
    private float saldo;

    public Cliente(float saldo) {
        this.saldo = saldo;
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
