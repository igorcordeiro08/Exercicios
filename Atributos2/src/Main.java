public class Main {
    public static void main(String[]args){
        double n=8250;
        System.out.println("A area de um campo de futebol, e de 8250 metros quadrados");
        n=ConversaoDeUnidadesDeArea.metrosParaPes(n);
        System.out.println((n)+ " Pes quadrados:");
        n=ConversaoDeUnidadesDeArea.pesParaCentimetros(n);
        System.out.println((n)+ " Centimetros quadrados:");
        n=ConversaoDeUnidadesDeArea.centimetrosParaPes(n);
        System.out.println((n)+ " Pes quadrados");
        n=ConversaoDeUnidadesDeArea.pesParaAcres(n);
        System.out.println((n)+ " Acres");
        n=ConversaoDeUnidadesDeArea.acresParaMilhas(n);
        System.out.println((n)+ " Milhas");


    }


}
