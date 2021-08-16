package Tratamentos2;

public class ContaCorrente {
    private float limite;
    private float saldo;
    private float valorLimite;

    public ContaCorrente(float limite,float saldo){
        this.limite=limite;
        this.saldo=saldo;
        }


    public void sacar(float valor){
        if(valor<0){
            throw new IllegalArgumentException("Impossivel sacar um valor negativo." );   
        }
        else if((valor>saldo) || (valor>saldo+valorLimite))
            saldo-=valor;
            throw new IllegalArgumentException("Impossivel sacar um valor maior que seu limite." ); 
    }
    public void depositar(float valor){
        if(valor<0){
            throw new IllegalArgumentException("Impossivel depositar um valor negativo." ); }
        else{
            saldo+=valor;
        }

    }
    public void setValorLimite(float valor){
        this.valorLimite=valor;
        if (valor<0)
            throw new IllegalArgumentException("O Valor deve ser maior que 0 ");
        
        }
    
}
