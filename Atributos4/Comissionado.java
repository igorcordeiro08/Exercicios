public class Comissionado extends Funcionario{
    private double vendas;
    private double porcentagem;
    
    public Comissionado(String nome,double vendas,double porcentagem){
        super(nome);
        setVendas(vendas);
        setPorcentagem(porcentagem);        
    }
       

    @Override
    public double recebe() {
        return getVendas()*getPorcentagem();                
        }

    
    public double getVendas() {
        return vendas;
    }

    
    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public void exibe() {
        System.out.println(this.nome+" recebera: "+this.recebe());    

    }
    
}
