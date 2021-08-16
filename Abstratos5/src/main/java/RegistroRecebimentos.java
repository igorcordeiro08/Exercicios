import java.util.ArrayList;
import java.util.List;
public class RegistroRecebimentos implements Recebivel {
    List<Recebivel> registros=new ArrayList<Recebivel>();
    
    
    
    public void Adicionar(Recebivel r){
        if (r !=null)
        {
            registros.add(r);
        }
    }
            
            
    public void imprime(Recebivel a){
        System.out.println(a);
    }
            
    public static void main(String[]args){
        RegistroRecebimentos r=new RegistroRecebimentos();
        ItemVenda mouse =new ItemVenda("Mouse USB",2,45.00); 
        r.registros.add(mouse);
        //r.Adicionar(new ItemVenda("Mouse USB", 2, 45.00));
        //r.registros.add(new ItemVenda("Mouse USB", 2, 45.00));
        //r.registros.add(new ItemVenda("Mouse USB", 2, 45.00));
        System.out.println(r.registros.toString());
             
    }
    

    @Override
    public double TotalizarReceita() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    
}
