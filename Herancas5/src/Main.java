public class Main {
    public static void main(String[]args){
        DiaDaSemana dia=new DiaDaSemana();
        dia.setDias(DiaDaSemana.DiasDaSemana.DOMINGO);
        System.out.println(dia.ehDiaUtil());
        dia.setDias(DiaDaSemana.DiasDaSemana.SEGUNDA);
        System.out.println(dia.ehDiaUtil());
    }

}
