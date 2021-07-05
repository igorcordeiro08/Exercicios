public class Main {
    public static void main(String[] args) {


        Agenda agenda=new Agenda();
        Contato igor=new Contato();
        igor.nome="Igor";
        igor.telefone="981773698";
        agenda.adicionar(igor);
        Contato jose=new Contato();
        jose.nome="Jose";
        jose.telefone="98997868";
        agenda.adicionar(jose);

        Contato maria=new Contato();
        maria.nome="Maria";
        maria.telefone="917238587";
        agenda.adicionar(maria);


        agenda.imprimeContatos();




    }
}