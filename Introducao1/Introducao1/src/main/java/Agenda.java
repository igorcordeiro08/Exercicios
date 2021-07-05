public class Agenda{
    Contato[] contatos=new Contato[10]
    int qnt=0;



    public void adicionar(Contato contato){
        contatos[qnt]=contato;
        qnt++;

    }
    public void imprimeContatos(){
        for (qnt=0;qnt<10;qnt++){
            System.out.println("Nome:"+contatos[qnt].nome);
        }
    }






}