/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class Main {
    public static void main(String[]args){
        Pessoa pessoa=new Pessoa();
        imprime(pessoa);
        pessoa.aniversario();
        pessoa.aniversario();
        imprime(pessoa);
        pessoa.aniversario();
        imprime(pessoa);
    }
    static void imprime(Pessoa pessoa){
        System.out.println("Nome:" +pessoa.nome);
        System.out.println("Idade:" +pessoa.idade);
        
    }
    
}
