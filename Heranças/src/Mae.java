public class Mae extends Pessoa {
    public Mae(String nome,int idade) {
        this.nome=nome;
        this.idade=idade;
    }

    public Mae(String nome, int idade, Pessoa pai, Pessoa mae){
        this.nome=nome;
        this.idade=idade;
        this.pai=pai;
        this.mae=mae;

    }

}
