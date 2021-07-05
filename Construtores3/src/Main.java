public class Main {
    public static void main(String[] args) {
        Agenda agenda=new Agenda();
        Contato igor=new Contato("Igor","981773698");
        Contato maria=new Contato("Maria","988884444");
        Contato joao=new Contato("Joao","912344321");
        agenda.adicionarContato(igor);
        agenda.adicionarContato(maria);
        agenda.adicionarContato(joao);

        agenda.imprimeContato();


    }
}
