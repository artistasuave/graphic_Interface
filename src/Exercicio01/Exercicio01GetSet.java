package Exercicio01;

/**
 * @author Michelle de Jesus Rogério    
 */
public class Exercicio01GetSet {
    
    private String nome, sobrenome = "";
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
}
