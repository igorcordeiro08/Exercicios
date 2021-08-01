public class Assalariados extends Funcionario{
    private double salario;
    
    public Assalariados(String nome,double salario){
        super(nome);
        this.nome=nome;
        setSalario(salario);
        
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
    public double getSalario(){
        return salario;
    }
        
    @Override
    public double recebe() {
        return getSalario()+salario*0.1;
    }

    @Override
    public void exibe(){
        System.out.println(this.nome+" recebera: "+this.getSalario());    
    }
    

}