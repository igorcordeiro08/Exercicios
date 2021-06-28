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
        Porta porta=new Porta();
        imprime(porta);
        porta.altura=2;
        porta.largura=1.5;
        porta.cor="Azul";
        porta.aberta=false;
        porta.estaAberta();
        imprime(porta);
        porta.pintar();
        porta.abreOuFecha();
        imprime(porta);
        porta.abreOuFecha();
        porta.estaAberta();
        porta.abreOuFecha();
        porta.estaAberta();
        
    }
    
    
    
    
    
    
    
    static void imprime(Porta porta){
        System.out.println("Cor:"+porta.cor);
        System.out.println("Largura:"+porta.largura);
        System.out.println("Altura:"+porta.altura);
        System.out.println("\n\n");
        
    }
    
}
