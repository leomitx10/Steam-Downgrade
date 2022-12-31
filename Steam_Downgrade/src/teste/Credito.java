package teste;

public class Credito extends Cartao{
    private int parcelamento;

    public Credito(Pagamento pagamento) {
        super(pagamento);
    }

   
    
    public void calcularParcela(){
        
    }
    public void efetuarCompra(){
        
    }

    public int getParcelamento() {
        return parcelamento;
    }

    public void setParcelamento(int parcelamento) {
        this.parcelamento = parcelamento;
    }
    
}
