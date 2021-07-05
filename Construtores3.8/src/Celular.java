public class Celular {
    private int bateria;
    int capacidade;

    public Celular(int bateria,int capacidade){
        this.bateria=bateria;
        this.capacidade=capacidade;
    }
    int mensTexto(){
        return bateria--;
    }
    int ligacao(int tempChamada){
        int temp=tempChamada/5;
        setBateria(getBateria() - temp);

        return getBateria();


    }


    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }


}
