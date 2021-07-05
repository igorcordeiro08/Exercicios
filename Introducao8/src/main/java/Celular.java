/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class Celular {
    Bateria bateria=new Bateria();
    
    
    int mensTexto(){
        return bateria.quantidade--;
    }
    int ligacao(int tempChamada){
        int temp=tempChamada/5;
        bateria.quantidade=bateria.quantidade-temp;
        
        return bateria.quantidade;
        
        
    }
    
    
}
