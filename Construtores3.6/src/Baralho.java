public class Baralho {
    private Carta[] cartas=new Carta[52];
    private int qntd=0;
    private String nomes[]={"Às", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"};
    private String naipes[] = {"Copas", "Espadas", "Paus", "Ouros"};

    public Baralho() {
    }

    void criaBaralho(){
    for(int i=0;i<4;i++){
        for (int j=0;j<13;j++) {
            cartas[qntd] = new Carta(nomes[j], naipes[i]);
            //System.out.println(cartas[i].getNome()+"de"+cartas[qntd].getNaipe());
            qntd++;
        }
        }
    }
    void imprimeBaralho(){
        for (int i=0;i<cartas.length;i++){
            //System.out.println(cartas[i].getNome());
            System.out.println(cartas[i].getNaipe()+" de "+cartas[i].getNome());
        }

    }
}
