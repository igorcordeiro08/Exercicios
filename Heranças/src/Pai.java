/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class Pai extends Pessoa {


    public Pai(String nome,int idade) {
        this.nome=nome;
        this.idade=idade;

    }

    public Pai(String nome, int idade, Pessoa pai, Pessoa mae){
        this.nome=nome;
        this.idade=idade;
        this.pai=pai;
        this.mae=mae;

    }

}
