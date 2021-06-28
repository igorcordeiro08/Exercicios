
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class Porta {
    boolean aberta;
    String cor;
    double largura;
    double altura;
    Scanner teclado=new Scanner(System.in);
    
    void abreOuFecha(){
        if (aberta==false){
            aberta=true;
            System.out.println("A porta abriu.");}
        else{
            aberta=false;
            System.out.println("A porta fechou.");}    
        }
    void pintar(){
        System.out.println("Qual cor deseja pintar?");
        cor=teclado.next();
        
    }
    void estaAberta(){
        if (aberta==true)
            System.out.println("A porta esta aberta");
        else 
           System.out.println("A porta esta fechada"); 
    }


}


