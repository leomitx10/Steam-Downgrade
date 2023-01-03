package teste;

public class Imposto {
    private DetalhesdoPedido detalhesdopedido;

    public Imposto(DetalhesdoPedido detalhesdopedido) {
        this.detalhesdopedido = detalhesdopedido;
    }

    
    
    public DetalhesdoPedido getDetalhesdopedido() {
        return detalhesdopedido;
    }

    public void setDetalhesdopedido(DetalhesdoPedido detalhesdopedido) {
        this.detalhesdopedido = detalhesdopedido;
    }
    
    
    public void calcularImposto(){
    }
    
}
