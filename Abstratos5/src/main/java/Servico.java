public class Servico implements Recebivel {    
    private int horas;
    private double precoHora;
    private String descricao;

    public Servico(String descricao,int horas,double precoHora){
        this.descricao=descricao;
        this.horas=horas;
        this.precoHora=precoHora;
        
    }
    
    
    public double TotalizarReceita() {
        return horas*precoHora;
    }
    
    
}
