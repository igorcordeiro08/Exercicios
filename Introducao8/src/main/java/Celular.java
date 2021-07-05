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
    int bateria;
    int capacidade;
    
    
    int mensTexto(){
        return bateria--;
    }
    int ligacao(int tempChamada){
        int temp=tempChamada/5;
        bateria=bateria-temp;
        
        return bateria; 
        
        
    }
    
    
}
