public class Pokemon {
    protected int hp;
    protected int atk;
    protected int def;
    protected int spAtk;
    protected int spDef;
    protected int spd;
    protected int xp=0;
    protected String nome;
    protected double tamanho;
    protected double peso;

    public Pokemon(){
        this("",0,0);
    }

    public Pokemon(String nome,double tamanho,double peso){
        this.nome=nome;
        this.tamanho=tamanho;
        this.peso=peso;

    }
    void evoluir(String nome){
        this.nome=nome;
        this.hp+=15;
        this.atk+=10;
        this.def+=10;
        this.spAtk+=10;
        this.spDef+=10;
        this.spd+=10;
        this.peso+=5;
        this.tamanho+=5;



    }

    public String getNome() {
        return nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public double getPeso() {
        return peso;
    }

}
