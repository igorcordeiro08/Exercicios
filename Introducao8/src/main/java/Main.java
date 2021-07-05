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
        Celular celular=new Celular();
        celular.bateria=100;
        System.out.println("Bateria:"+celular.bateria);
        celular.mensTexto();
        System.out.println("Bateria:"+celular.bateria);
        celular.ligacao(30);
        System.out.println("Bateria:"+celular.bateria);
        celular.ligacao(300);
        System.out.println("Bateria:"+celular.bateria);
    }
    
}
