package teste;
public class DetalhesdoPedido {
    private int numeroPedido;
    private String nomeProduto;
    private int quantidadeProduto;
    private float custoUnidade;
    private float subtotal;

    public DetalhesdoPedido(int numeroPedido, String nomeProduto, int quantidadeProduto, float custoUnidade, float subtotal) {
        this.numeroPedido = numeroPedido;
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.custoUnidade = custoUnidade;
        this.subtotal = subtotal;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public float getCustoUnidade() {
        return custoUnidade;
    }

    public void setCustoUnidade(float custoUnidade) {
        this.custoUnidade = custoUnidade;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    
    
    
    
    
    public void calcularPreco(){
    }
}
