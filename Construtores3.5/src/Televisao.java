import java.util.Scanner;
public class Televisao {
    private boolean ligada;
    private int volume;
    private int canal;
    private boolean silencioso=false;
    Scanner teclado=new Scanner(System.in);
    public Televisao(boolean ligada,int volume,int canal,boolean silencioso){
        this.ligada=ligada;
        this.volume=volume;
        this.canal=canal;
        this.silencioso=silencioso;

    }
    void ligaDesliga(){
        if(isLigada()==true){
            setLigada(false);
            System.out.println("Desligando...");}
        else{
            setLigada(true);
            System.out.println("Ligando...");}

    }
    int mudaCanal(){
        System.out.println("Canal...");
        setCanal(teclado.nextInt());
        return getCanal();
    }
    int proxCanal(){
        return canal++;
    }
    int voltaCanal(){
        return canal--;
    }
    void mute(){
        if(isSilencioso()==false){
            setSilencioso(true);
            System.out.println("MUTE");
            setVolume(0);
        }
        else{
            setSilencioso(false);
            setVolume(30);

        }
    }


    public boolean isLigada() {
        return ligada;
    }


    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isSilencioso() {
        return silencioso;
    }

    public void setSilencioso(boolean silencioso) {
        this.silencioso = silencioso;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

}

