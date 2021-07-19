public class DiaDaSemana{

    private DiasDaSemana dias;
    public enum DiasDaSemana {
        DOMINGO,
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO;}

    public boolean ehDiaUtil(){
        if (this.getDia() !=DiasDaSemana.DOMINGO && this.getDia() !=DiasDaSemana.SABADO ){
            return true;
        }
        else{
            return false;
        }}

    public DiasDaSemana getDia(){
        return this.dias;
    }

    public void setDias(DiasDaSemana dias) {
        this.dias = dias;
    }
}



