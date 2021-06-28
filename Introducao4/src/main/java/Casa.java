
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
public class Casa {
    Porta porta1;
    Porta porta2;
    Porta porta3;
    String cor;
    Scanner teclado=new Scanner(System.in);  
    
    void pintar(){
        System.out.println("Qual cor deseja pintar?");
        cor=teclado.next();}
    
    int qntDePortasAbertas(){
        int qntAbertas=0;
        if (porta1.aberta==true)
            qntAbertas++;
        if (porta2.aberta==true)
            qntAbertas++;
        if (porta2.aberta==true)
            qntAbertas++;
        
        return qntAbertas;
        }
    }
        

