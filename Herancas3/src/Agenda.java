public class Agenda {
    private Contato[] contatos = new Contato[3];
    private int qntd = 0;

    public void adicionarContato(Contato contato) {
        contatos[qntd] = contato;
        qntd++;
    }

    public void imprimeContato() {
        for (qntd = 0; qntd < contatos.length; qntd++) {
            if (contatos[qntd].getNome() != null)
            {
                System.out.println("Nome:" + contatos[qntd].getNome());
                System.out.println(("Cpf:" + contatos[qntd].getCpf()));
                System.out.println(("Endereco:" + contatos[qntd].getEndereco()));
                System.out.println(("Aniversario:" + contatos[qntd].getAniversario())+"\n");
                }else {
                    System.out.println("Nome:" + contatos[qntd].getRazaoSocial());
                    System.out.println(("Cpf:" + contatos[qntd].getCnpj()));
                    System.out.println(("Endereco:" + contatos[qntd].getEndereco()));
                    System.out.println(("Faturamento:" + contatos[qntd].getFaturamento())+"\n");
        }
    }}
    public void buscaContato(String cpf) {
        for (qntd = 0; qntd < contatos.length; qntd++) {
            if (contatos[qntd].getCpf() == cpf) {
                System.out.println("Nome:" + contatos[qntd].getNome());
                System.out.println(("Cpf:" + contatos[qntd].getCpf()));
                System.out.println("Endereco:" + contatos[qntd].getEndereco());
                System.out.println(("Aniversario:" + contatos[qntd].getAniversario()));
                System.out.println("\n");}

            if (contatos[qntd].getCnpj()==cpf){
                System.out.println("Nome:" + contatos[qntd].getRazaoSocial());
                System.out.println(("Cpf:" + contatos[qntd].getCnpj()));
                System.out.println(("Endereco:" + contatos[qntd].getEndereco()));
                System.out.println(("Faturamento:" + contatos[qntd].getFaturamento())+"\n");
            }

            }
        }

    }
