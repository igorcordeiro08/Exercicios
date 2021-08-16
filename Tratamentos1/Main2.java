package Tratamentos1;

public class Main2 {
    public static void main(String[]args){
        metodo1(1);
        
        
    }
       
    public static void metodo1(int i ){
        if (i<10)
            throw new IllegalArgumentException("Digite um numero maior que 10" );   
    }
}
    

