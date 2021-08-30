
import java.util.logging.Level;
import java.util.logging.Logger;


public class MinhaThread extends Thread {
    private int inicio;
    private int numero=2;
    public static int primos=0;
    private int n,i,j;
    private boolean primo;
    private int numDiv=0;
    private int tempo;

    public MinhaThread(int inicio,int fim){
        this.inicio=inicio;
        this.n=fim;
        
    }
    @Override
    public void run() {
        
        for (int i=inicio;i<=n;i++){
            primo=true;
            if(i==1)
                primo=false;
            if (primo){
                if (i%2==0 && i!=2){
                    primo=false;
                }
            }
            if (primo){
                for (int j=2;j<=(i/2);j++){
                    if (i%j==0){
                        primo=false;
                        break;
                        
                    }
                }
            }
            if (primo){
                primos++;
                
                System.out.println(i);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    System.out.println("Existem "+primos);

    
    
    
}

}    