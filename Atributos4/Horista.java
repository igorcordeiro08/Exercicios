public class Horista extends Funcionario {
    private double ganhoPorHora;
    private double horas;
    
    public Horista(String nome,double ganhoPorHora,double horas){
        super(nome);
        setGanhoPorHora(ganhoPorHora);
        setHoras(horas);
    }
    
    
    @Override
    public double recebe() {
        if (getHoras()<=40)
            return getGanhoPorHora()*getHoras();   
        else
            return 40*getGanhoPorHora()+(getHoras()-40)*getGanhoPorHora()*1.5;
    }

   
    public double getGanhoPorHora() {
        return ganhoPorHora;
    }

    public void setGanhoPorHora(double ganhoPorHora) {
        this.ganhoPorHora = ganhoPorHora;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    @Override
    public void exibe() {
        System.out.println(this.nome+" recebera: "+this.recebe());    

    }
    
}
