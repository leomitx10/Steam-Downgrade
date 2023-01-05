/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    @Override
    public String toString() {
        return "Nome do usuário: " + this.nome + "\nIdade do usuário: " + this.idade + "\nJogos adquiridos: " + this.qtdJogos + "\nApelido: " + this.apelido + "\nCPF: " + this.cpf + "\nEmail: " + this.email + "\nSenha do usuário: " + this.senha + "\nEndereco: " + this.endereco;
    }
    
    public String save() {
       
        try {
            FileWriter fw = new FileWriter("usuarios.conf", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print(this.nome + ";");
            pw.print(this.idade + ";");
            pw.print(this.qtdJogos + ";");
            pw.print(this.apelido + ";");
            pw.print(this.cpf + ";");
            pw.print(this.email + ";");
            pw.print(this.senha + ";");
            pw.print(this.endereco + ";\n");
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Cadastrado com sucesso!";
    }
    
    public void adcionarAmigo(){
     
    }
     
    public void removerAmigo(){
      
    }
    
}
