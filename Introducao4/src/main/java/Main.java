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
        Casa casa=new Casa();
        casa.cor="Branca";
        casa.porta1=new Porta();
        casa.porta2=new Porta();
        casa.porta3=new Porta();
        System.out.println("Cor:"+casa.cor+"\n");
        casa.porta1.aberta=false;
        casa.porta2.aberta=true;
        casa.porta3.aberta=false;
        casa.porta1.abreOuFecha();
        casa.porta2.abreOuFecha();
        casa.porta3.abreOuFecha();
        casa.pintar();
        System.out.println("Cor:"+casa.cor+"\n");
        casa.porta1.abreOuFecha();
        casa.porta2.abreOuFecha();
        casa.porta3.abreOuFecha();
        
        System.out.println(casa.qntDePortasAbertas()+"Porta(s) abertas.");
    }
    static void imprime(Porta porta){
        System.out.println(porta.aberta);

    
}}
