package teste;

public class Ajuda {
    private String informacoesLegais;
    private String acordoDeAssinatura;
    private String perguntasFrequentes;

    public Ajuda(String informacoesLegais, String acordoDeAssinatura, String perguntasFrequentes) {
        this.informacoesLegais = informacoesLegais;
        this.acordoDeAssinatura = acordoDeAssinatura;
        this.perguntasFrequentes = perguntasFrequentes;
    }
    
    public String getInformacoesLegais() {
        return informacoesLegais;
    }

    public void setInformacoesLegais(String informacoesLegais) {
        this.informacoesLegais = informacoesLegais;
    }

    public String getAcordoDeAssinatura() {
        return acordoDeAssinatura;
    }

    public void setAcordoDeAssinatura(String acordoDeAssinatura) {
        this.acordoDeAssinatura = acordoDeAssinatura;
    }

    public String getPerguntasFrequentes() {
        return perguntasFrequentes;
    }

    public void setPerguntasFrequentes(String perguntasFrequentes) {
        this.perguntasFrequentes = perguntasFrequentes;
    }
    
}
