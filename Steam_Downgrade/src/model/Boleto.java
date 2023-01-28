package model;
import static interface_grafica.Carrinho.txtSubtotal;
import static java.lang.Float.parseFloat;
import java.util.Date;
public class Boleto extends Formadepagamento{
    private String codigo;
    private Date dataVencimento;

    public Boleto(Pagamento pagamento) {
        super(pagamento);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    
    
}
