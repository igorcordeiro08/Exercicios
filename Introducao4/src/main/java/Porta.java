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
    
    
    
    
    void abreOuFecha(){
        if (aberta==false){
            aberta=true;
            System.out.println("A porta abriu.");}
        else{
            aberta=false;
            System.out.println("A porta fechou.");}  
    }
    void estaAberta(){
        if (aberta==true)
            System.out.println("A porta esta aberta");
        else 
           System.out.println("A porta esta fechada"); 
    }
}
