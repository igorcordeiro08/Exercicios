public class ComissionadoAssalariado extends Comissionado {
    private double salarioBase;

    public ComissionadoAssalariado(String nome,double vendas,double porcentagem,double salario){
        super(nome,vendas,porcentagem);
        setSalarioBase(salario);
        
        
        
    }
    
    @Override
    public double recebe() {
        return getSalarioBase()+super.recebe();
    }

    /**
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    @Override
    public void exibe() {
        System.out.println(this.nome+" recebera: "+this.recebe());    

    }
    
    
}
