public class Agenda{
    Contato[] contatos=new Contato[3];
    int qnt=0;



    public void adicionar(Contato contato){
        contatos[qnt]=contato;
        qnt++;

    }
    public void imprimeContatos(){
        for (qnt=0;qnt< contatos.length;qnt++){
            System.out.println("#"+(qnt+1));
            System.out.println("Nome:"+contatos[qnt].nome);
            System.out.println("Nome:"+contatos[qnt].telefone);
        }
    }






}