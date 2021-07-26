public class ItemVenda implements Recebivel {
    private String produto;
    private int quantidade;
    private double precoUnitario;
    
    public ItemVenda(String produto,int quantidade,double precoUnitario){
        this.produto=produto;
        this.quantidade=quantidade;
        this.precoUnitario=precoUnitario;
    }


    public double TotalizarReceita() {
        return precoUnitario*quantidade;
    }
    }
    

