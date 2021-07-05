public class Carta {
    private String naipe;
    private String nome;

    public Carta(String naipe, String nome) {
        this.naipe = naipe;
        this.nome = nome;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
