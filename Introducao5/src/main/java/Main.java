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
        
    Televisao tv=new Televisao();
    tv.ligada=true;
    tv.canal=4;
    tv.volume=30;
    estado(tv);
    tv.ligaDesliga();
    tv.ligaDesliga();
    tv.mudaCanal();
    tv.proxCanal();
    tv.voltaCanal();
    tv.mute();
    estado(tv);
    tv.mute();
    estado(tv);
    
    
 
    
}
    static void estado(Televisao tv){
        if(tv.ligada==true)
            System.out.println("A Tv está no canal:"+tv.canal);
            System.out.println("A Tv está no volume:"+tv.volume);
            System.out.println("\n");
          
        
        
    }


}
  