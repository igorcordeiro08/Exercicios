
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
public class Teste {
    
    public static void main(String[]args){
        int n;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite o valor de N: ");
        n=teclado.nextInt();
        
        
        MinhaThread thread1=new MinhaThread(0,n/2);
        //Thread t1=new Thread(thread1);
        thread1.start();
        MinhaThread thread2=new MinhaThread(n/2,n);
        //Thread t2=new Thread(thread2);
        thread2.start();
        //System.out.println("Existem "+);
                
    }
    
}
