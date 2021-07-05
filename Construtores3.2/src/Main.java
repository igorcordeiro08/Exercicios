public class Main {
    public static void main(String[]args){
        Pessoa pessoa=new Pessoa("Igor",24);
        imprime(pessoa);
        pessoa.aniversario();
        pessoa.aniversario();
        imprime(pessoa);
        pessoa.aniversario();
        imprime(pessoa);
    }
    static void imprime(Pessoa pessoa){
        System.out.println("Nome:" +pessoa.getNome());
        System.out.println("Idade:" +pessoa.getIdade());

    }

}
