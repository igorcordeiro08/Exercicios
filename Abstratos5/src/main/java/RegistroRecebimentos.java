
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class RegistroRecebimentos implements Recebivel {
    private ArrayList<Recebivel> registros=new ArrayList<Recebivel>();
    
    
    
    public void Adicionar(Recebivel r){
        if (r !=null)
        {
            registros.add(r);
        }
    }
            
            
    public void imprime(Recebivel a){
        System.out.println(a);
    }
    
    //public static void add(Recebivel a){        
        //RegistroRecebimentos.registros[]=a;
    //}
    
    
            
            
            
    public static void main(String[]args){
        RegistroRecebimentos r=new RegistroRecebimentos();
        r.Adicionar(new ItemVenda("Mouse USB", 2, 45.00));
        r.registros.add(new ItemVenda("Mouse USB", 2, 45.00));
        //r.registros.add(new ItemVenda("Mouse USB", 2, 45.00));
        System.out.println(r.registros);
        
        
      
        
    }
    
    
    
    
    @Override
    public double TotalizarReceita() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    
}
