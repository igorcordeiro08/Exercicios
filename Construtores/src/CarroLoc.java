public class CarroLoc {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private float km;
    private String combustivel;
    private float precoDiaria;
    private int estoque;

    public float calcula_preco(float precoDiaria,int dias){
        return precoDiaria*dias;
    }
    public void aluga(Carro carro){}


}