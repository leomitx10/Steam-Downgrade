package teste;

public class Administrador extends Usuario {
    private String nomeAdm;

    public Administrador(String nome, int idade, String apelido, String cpf, String email, String senha, String endereco) {
        super(nome, idade, apelido, cpf, email, senha, endereco);
    }

    public String getNomeAdm() {
        return nomeAdm;
    }

    public void setNomeAdm(String nomeAdm) {
        this.nomeAdm = nomeAdm;
    }
    
    public void atualizaCatalogo(){
    
    }
}
