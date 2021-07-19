public class Pessoa {
    private String razaoSocial;
    private String cnpj;
    private int faturamento;

    private String cpf;
    private String aniversario;
    private String nome;
    private String endereco;


    public Pessoa() {
    }

    public void addContato(String nome, String cpf, String endereco, String aniversario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.aniversario = aniversario;
    }

    public void addContato(String nome, String cnpj, String endereco, int faturamento) {
        this.razaoSocial = nome;
        this.cnpj = cnpj;
        this.faturamento = faturamento;
        this.aniversario = aniversario;


    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(int faturamento) {
        this.faturamento = faturamento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}