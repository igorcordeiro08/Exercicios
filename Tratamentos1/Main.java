package Tratamentos1;

import java.util.Scanner;

public class Main{

                /*IllegalArgumentException-Ocorre quando e passado um argumento
                invalido para um metodo 
                NumberFormatException- Ocorre quando a aplciacao tenta 
                converter uma string para um
                tipo numerico, mas a string n tem o formato apropriado.   */

public static void main(String[]args){

    try{
        Scanner teclado=new Scanner(System.in);
    
        int n1=Integer.parseInt(teclado.next());
        int n2=Integer.parseInt(teclado.next());

        int res=n1/n2;
        System.out.println(res);
        teclado.close();}
        catch(NumberFormatException n){
            System.out.println("Formato invalido");
        
    }
    
}      
}