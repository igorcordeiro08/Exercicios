import java.util.Scanner;
public class Caixa {
    public static void main(String[] args){
        Produto feijao=new Produto("Feijão",4,10);
        Scanner teclado=new Scanner(System.in);
        Produto arroz=new Produto("Arroz",6,10);
        Produto miojo=new Produto("Miojo",2,20);


        Pedido pedido=new Pedido();
        pedido.addItem(feijao,2);
        pedido.addItem(arroz,2);
        pedido.addItem(miojo,10);


        System.out.println("O preço total foi de:"+pedido.getTotal());
        System.out.println("Qual vai ser a forma de pagamento?");
        pedido.pagamento=teclado.next();
        System.out.println("Quanto deseja pagar?");
        pedido.valorPago=teclado.nextInt();
        pedido.formaDePagamento(pedido.getTotal(),pedido.valorPago,pedido.pagamento);
    }
}