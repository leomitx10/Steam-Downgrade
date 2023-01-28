package model;

import static interface_grafica.Carrinho.txtSubtotal;
import static java.lang.Float.parseFloat;

public class Cartao{
    
    private String nome;
    private String numero;
    private String validade;
    private String CVV;

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }
    
}
