public class Main {
    public static void main(String[]args){
        Porta porta=new Porta(false,"azul",1.5,2);
        imprime(porta);
        porta.estaAberta();
        imprime(porta);
        porta.pintar();
        porta.abreOuFecha();
        imprime(porta);
        porta.abreOuFecha();
        porta.estaAberta();
        porta.abreOuFecha();
        porta.estaAberta();

    }

    static void imprime(Porta porta){
        System.out.println("Cor:"+porta.getCor());
        System.out.println("Largura:"+porta.getLargura());
        System.out.println("Altura:"+porta.getAltura());
        System.out.println("\n\n");

    }

}
