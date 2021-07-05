import java.util.Scanner;

public class Porta {
    boolean aberta;
    private String cor;
    private double largura;
    private double altura;
    Scanner teclado=new Scanner(System.in);

    public Porta(boolean aberta,String cor,double largura,double altura){
        this.aberta=aberta;
        this.cor=cor;
        this.largura=largura;
        this.altura=altura;

    }
    void abreOuFecha(){
        if (aberta==false){
            aberta=true;
            System.out.println("A porta abriu.");}
        else{
            aberta=false;
            System.out.println("A porta fechou.");}
    }
    void pintar(){
        System.out.println("Qual cor deseja pintar?");
        setCor(teclado.next());

    }
    void estaAberta(){
        if (aberta==true)
            System.out.println("A porta esta aberta");
        else
            System.out.println("A porta esta fechada");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}


