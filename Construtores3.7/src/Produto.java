public class Produto {
    private String descricao;
    private float preco;
    private int estoque;

    public Produto(String descricao,float preco,int estoque){
        this.descricao=descricao;
        this.preco=preco;
        this.estoque=estoque;    }

    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }





}
