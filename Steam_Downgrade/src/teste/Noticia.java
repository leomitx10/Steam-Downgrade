package teste;

public class Noticia {
    
    private String lancamentos;
    private String eventos;
    private String destaques;
    private String topico;

    public Noticia(String lancamentos, String eventos, String destaques, String topico) {
        this.lancamentos = lancamentos;
        this.eventos = eventos;
        this.destaques = destaques;
        this.topico = topico;
    }
    
    public String getLancamentos() {
        return lancamentos;
    }

    public void setLancamentos(String lancamentos) {
        this.lancamentos = lancamentos;
    }

    public String getEventos() {
        return eventos;
    }

    public void setEventos(String eventos) {
        this.eventos = eventos;
    }

    public String getDestaques() {
        return destaques;
    }

    public void setDestaques(String destaques) {
        this.destaques = destaques;
    }

    public String getTopico() {
        return topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }
    
}

