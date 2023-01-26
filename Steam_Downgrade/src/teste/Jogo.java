package teste;

public class Jogo {
    private String nome;
    private float valor;
    private int id;
    private int classificacao_Indicativa;
    private String desenvolvedor;
    private String distribuidora;
    private String requisitos;
    private String genero;
    private String descricao;
    private String senha;

    public Jogo(String nome, float valor, int classificacao_Indicativa, String desenvolvedor, String distribuidora, String requisitos, String genero, String descricao) {
        this.nome = nome;
        this.valor = valor;
       
        this.classificacao_Indicativa = classificacao_Indicativa;
        this.desenvolvedor = desenvolvedor;
        this.distribuidora = distribuidora;
        this.requisitos = requisitos;
        this.genero = genero;
        this.descricao = descricao;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassificacao_Indicativa() {
        return classificacao_Indicativa;
    }

    public void setClassificacao_Indicativa(int classificacao_Indicativa) {
        this.classificacao_Indicativa = classificacao_Indicativa;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
}
