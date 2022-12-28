package teste;

public class Pedido {
    private int numPedido;
    private String dataCriacao;
    private String nomeCliente;
    private String numCliente;
    private String estado;
    private String numEnvio;
    private DetalhesdoPedido detalhesdopedido;

    public DetalhesdoPedido getDetalhesdopedido() {
        return detalhesdopedido;
    }

    public void setDetalhesdopedido(DetalhesdoPedido detalhesdopedido) {
        this.detalhesdopedido = detalhesdopedido;
    }
    
    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumEnvio() {
        return numEnvio;
    }

    public void setNumEnvio(String numEnvio) {
        this.numEnvio = numEnvio;
    }
    
    public void finalizarPedido(){
        
    }
    
}
