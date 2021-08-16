package Tratamentos2;

public class TesteContaCorrente {
    public static void main(String[]args){
        ContaCorrente conta=new ContaCorrente(100,1000);
    try{          
        conta.sacar(100000f); 
        
    }
    catch(IllegalArgumentException e){   
        System.out.println(e.getMessage());
    }
    try{
        conta.depositar(-100f);
    }
    catch(IllegalArgumentException e){
        System.out.println(e.getMessage());              
    }
    try{
        conta.setValorLimite(-1000f);
    }
    catch(IllegalArgumentException e){
        System.out.println(e.getMessage());              
    }
         
}
}