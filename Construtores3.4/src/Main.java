public class Main {
    public static void main(String[]args){
        Casa casa=new Casa();
        casa.setCor("Branca");
        casa.porta1=new Porta(false);
        casa.porta2=new Porta(true);
        casa.porta3=new Porta(false);
        System.out.println("Cor:"+casa.getCor()+"\n");
        casa.porta1.setAberta(false);
        casa.porta2.setAberta(true);
        casa.porta3.setAberta(false);
        casa.porta1.abreOuFecha();
        casa.porta2.abreOuFecha();
        casa.porta3.abreOuFecha();
        casa.pintar();
        System.out.println("Cor:"+casa.getCor()+"\n");
        casa.porta1.abreOuFecha();
        casa.porta2.abreOuFecha();
        casa.porta3.abreOuFecha();

        System.out.println(casa.qntDePortasAbertas()+"Porta(s) abertas.");
    }
    static void imprime(Porta porta){
        System.out.println(porta.isAberta());


    }}
