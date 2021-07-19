public class Main {

    public static void main(String[]args){

        Eletrico pikachu=new Eletrico("Pikachu",0.4,6);
        Fogo charmander=new Fogo("Charmander",0.6,8.5);
        imprime(pikachu);
        pikachu.evoluir("Raichu");
        charmander.evoluir("Charmeleon");
        imprime(pikachu);
        imprime(charmander);



    }

    static void imprime(Pokemon pokemon){
        System.out.println("Nome "+pokemon.getNome());
        System.out.println("Tamanho "+pokemon.getTamanho()+"m");
        System.out.println("Peso "+pokemon.getPeso()+"KG");
    }
}
