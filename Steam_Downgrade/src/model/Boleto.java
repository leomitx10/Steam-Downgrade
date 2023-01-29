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
    
    public float calcularDescontoBoleto(){
        float desconto = (float) (parseFloat(txtSubtotal.getText()) * 0.02);
        float subtotal = parseFloat(txtSubtotal.getText())- desconto;
        return subtotal;
        }
    
}
