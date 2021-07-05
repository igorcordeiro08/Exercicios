import java.util.Scanner;

public class Casa {
    Porta porta1;
    Porta porta2;
    Porta porta3;
    private String cor;
    Scanner teclado=new Scanner(System.in);
    /*public Casa(Porta porta1,Porta porta2,Porta porta3){
        this.porta1=porta1;
        this.porta2=porta2;
        this.porta3=porta3;  }*/

    void pintar(){
        System.out.println("Qual cor deseja pintar?");
        setCor(teclado.next());}

    int qntDePortasAbertas(){
        int qntAbertas=0;
        if (porta1.isAberta()==true)
            qntAbertas++;
        if (porta2.isAberta()==true)
            qntAbertas++;
        if (porta2.isAberta()==true)
            qntAbertas++;

        return qntAbertas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}


