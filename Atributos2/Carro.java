public class Carro implements CarbonFootPrint{
  private String combustivel;
  private float cilindrada;

  public Carro(String combustivel,float cilindrada){
    this.combustivel=combustivel;
    this.cilindrada=cilindrada;

  }
  public double getCarbonFootPrint(){
    if(this.combustivel.equals("gasolina")){
      System.out.println("Usando gasolina...");
      return this.cilindrada*60;
    }
    else if(this.combustivel.equals("etanol")){
      System.out.println("Usando etanol...");
      return this.cilindrada*40;
    }
    return this.cilindrada*60;
    

  }
 

}