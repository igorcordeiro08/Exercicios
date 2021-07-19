public class Contato extends Pessoa {

    public Contato(String nome,String cpf,String endereco,String aniversario){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.setAniversario(aniversario);
    }
    public Contato(String razaoSocial,String cnpj,String endereco,int faturamento){
        this.setRazaoSocial(razaoSocial);
        this.setCnpj(cnpj);
        this.setEndereco(endereco);
        this.setFaturamento(faturamento);
    }


}


