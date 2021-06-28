
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class Caixa {
    public static void main(String[] args){
    Produto feijao=new Produto();
    Scanner teclado=new Scanner(System.in);
    feijao.descricao="Feijão";
    feijao.preco=4;
    feijao.estoque=10;
    
    Produto arroz=new Produto();
    arroz.descricao="Arroz";
    arroz.preco=6;
    arroz.estoque=10;
    
    Produto miojo=new Produto();
    miojo.descricao="Miojo";
    miojo.preco=2;
    miojo.estoque=20;
    
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