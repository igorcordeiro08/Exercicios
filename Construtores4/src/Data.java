public class Data {
    private int dia;
    private String Mes;
    private int mes;
    private int ano;

    public Data(int dia,int mes,int ano){
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
    }
    public Data(int dia,String mes,int ano){
        this.Mes=mes;
        this.dia=dia;
        this.ano=ano;
    }
    public Data(int dia,int ano){
        this.dia=dia;
        this.ano=ano;
    }

    public int getDia() {
        return dia;
    }

    public String getMes() {
        return Mes;
    }


    public int get_Mes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

}
