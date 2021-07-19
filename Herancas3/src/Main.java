public class Main {
    public static void main(String[]args){
        Agenda agenda=new Agenda();
        Contato igor=new Contato("Igor","12331522786","Rua 1","26/08/1996");
        Contato hamburgueria=new Contato("Hamburgueria ltda","10101010101-001","Rua 2 de julho",10000);
        Contato joao=new Contato("Joao da Silva","1223232227","Rua 4 de julho","19/07/2021");
        agenda.adicionarContato(joao);
        agenda.adicionarContato(hamburgueria);
        agenda.adicionarContato(igor);
        agenda.imprimeContato();
        agenda.buscaContato("10101010101-001");
        agenda.buscaContato("12331522786");






    }
}
