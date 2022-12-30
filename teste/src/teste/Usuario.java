/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author Leandro
 */
public class Usuario {
    private String nome;
    private int idade;
    private int qtdJogos;
    private String apelido;
    private String cpf;
    private String email;
    private String senha;
    private String endereco;

    public Usuario(String nome, int idade, int qtdJogos, String apelido, String cpf, String email, String senha, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.qtdJogos = qtdJogos;
        this.apelido = apelido;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQtdJogos() {
        return qtdJogos;
    }

    public void setQtdJogos(int qtdJogos) {
        this.qtdJogos = qtdJogos;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void logar(){
    
    }
    
    public void deslogar(){
    
    }
    
    public void adcionarAmigo(){
     
    }
     
    public void removerAmigo(){
      
    }
    
}
