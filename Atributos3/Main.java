import java.util.ArrayList;


public class Main {
  public static void main(String[] args) {
   ArrayList<CarbonFootPrint> list=new ArrayList();
   list.add(new Bicicleta());
   list.add(new Bicicleta());
   list.add(new Carro("gasolina",200));
   list.add(new Carro("etanol",200));
   list.add(new Casa(4,10,true,false));
   list.add(new Escola(50,100,true,true));

   for (CarbonFootPrint i:list){
     i.getCarbonFootPrint();
   

   }
   
  }
}