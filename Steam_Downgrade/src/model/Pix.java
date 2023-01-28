package model;

import static interface_grafica.Carrinho.txtSubtotal;
import static java.lang.Float.parseFloat;

public class Pix extends Formadepagamento{
    
    private String chavePix;

    public Pix(Pagamento pagamento) {
        super(pagamento);
    }
    
    public void efetuarCompra(){
        
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
    
}
