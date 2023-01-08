/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.awt.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Leandro
 */
public class Usuario {
    private String nome;
    private int idade;
    private String apelido;
    private String cpf;
    private String email;
    private String senha;
    private String endereco;

    public Usuario(String nome, int idade, String apelido, String endereco, String cpf, String email,String senha) {
        this.nome = nome;
        this.idade = idade;
        this.apelido = apelido;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
    }

    public Usuario(String email, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        return "Nome do usuário: " + this.nome + "\nIdade do usuário: " + this.idade + "\nJogos adquiridos: " + "\nApelido: " + this.apelido + "\nCPF: " + this.cpf + "\nEmail: " + this.email + "\nSenha do usuário: " + this.senha + "\nEndereco: " + this.endereco;
    }
    
    public void adcionarAmigo(){
     
    }
     
    public void removerAmigo(){
      
    }
    
  
    public static String verifica(String palavra,String local)throws FileNotFoundException{ 
        boolean flag = false;
        int count = 0;
        //Reading the contents of the file
        Scanner sc2 = new Scanner(new FileInputStream(local));
        while(sc2.hasNextLine()) {
            String line = sc2.nextLine();
            if(line.indexOf(palavra) != -1) {
                flag = true;    
                count = count+1;
            }
        }
        if(flag) {
            return palavra;
        }else {
            return null;
        }
    }
    
    public static String Read(String Caminho){
        String conteudo = "";
        try {
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha="";
            try {
                linha = lerArq.readLine();
                while(linha!=null){
                    conteudo += linha+"\n";
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return "";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return "";
        }
    }
    
    public static boolean Write(String Caminho,String Texto){
        try {
            FileWriter arq = new FileWriter(Caminho,true);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public void lerarquivo() throws FileNotFoundException{
        FileInputStream entradaArquivo = new FileInputStream("usuarios.con");
        Scanner lerArquivo =new Scanner (entradaArquivo,"UTF-8");   
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
        
        
    }
    
}
    
    
    

