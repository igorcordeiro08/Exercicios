
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
public class Televisao {
    boolean ligada;
    int volume;
    int canal;
    boolean silencioso=false;
    Scanner teclado=new Scanner(System.in);
    
    void ligaDesliga(){
        if(ligada==true){
            ligada=false;
            System.out.println("Desligando...");}
        else{
            ligada=true;
            System.out.println("Ligando...");}
                    
                    }   
    int mudaCanal(){
        System.out.println("Canal...");
        canal=teclado.nextInt();        
        return canal;
        }
    int proxCanal(){
        return canal++;
    }
    int voltaCanal(){
        return canal--;
    }
    void mute(){
        if(silencioso==false){
            silencioso=true;
            System.out.println("MUTE");
            volume=0;
        }
        else{
            silencioso=false;
            volume=30;
            
        }
    }
    
        }
            
   