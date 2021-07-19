
public class Pessoa {
    public String nome;
    public int idade;
    public Pessoa pai,mae;

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public void imprimePessoa(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Nome do Pai: "+this.pai.pai);
        System.out.println("Nome da Mae: "+this.mae);
    }
}
