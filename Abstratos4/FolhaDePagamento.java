public class FolhaDePagamento {
    public static void main(String[]args){
        Assalariados igor=new Assalariados("Igor",1045);
        Horista maria=new Horista("Maria",26,44);
        Comissionado joao=new Comissionado("Joao",10000,0.1);
        ComissionadoAssalariado pedro=new ComissionadoAssalariado("Pedro",5000,0.1,1045);
        igor.exibe();
        maria.exibe();
        joao.exibe();
        pedro.exibe();
        
        
    }
       
}