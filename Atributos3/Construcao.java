public abstract class Construcao implements CarbonFootPrint{
  private int numero_pessoas;
  private int numero_lampadas;
  private boolean usa_renovavel;
  private boolean usa_ar_condicionado;
  
  public Construcao(int numero_pessoas,int numero_lampadas,boolean usa_renovavel,boolean usa_ar_condicionado){
    this.numero_pessoas=numero_pessoas;
    this.numero_lampadas=numero_lampadas;
    this.usa_renovavel=usa_renovavel;
    this.usa_ar_condicionado=usa_ar_condicionado;
      } 
 public double getCarbonFootPrint(){
  if(usa_renovavel==true)
    if(usa_ar_condicionado==true){
      System.out.println("Diminua suas pegadas de carbono!");
      return numero_pessoas*numero_lampadas*30;}
    else{
      System.out.println("Otimo");
      return numero_pessoas*numero_lampadas*15;
    }
  
  else
    if(usa_ar_condicionado==true)
      return numero_pessoas*numero_lampadas*50;
    
    else
      return numero_pessoas*numero_lampadas*25;
    
   
}

}
