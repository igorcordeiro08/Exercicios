public class Agenda {
    private Contato[] contatos=new Contato[3];
    private int qntd=0;

    public void adicionarContato(Contato contato){
        contatos[qntd]=contato;
        qntd++;
    }
    public void imprimeContato(){
        for (qntd=0;qntd< contatos.length;qntd++){
            System.out.println("#"+(qntd+1));
            System.out.println("Nome:"+contatos[qntd].getNome());
            System.out.println(("Telefone:"+contatos[qntd].getTelefone()));
        }
    }




}
