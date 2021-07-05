public class Pedido {
    Item[] itens=new Item[100];
    int qntDeItens=0;
    String pagamento;
    float valorPago;

    float getTotal(){
        float total=0;
        for (int i=0;i<qntDeItens;i++){
            total+=itens[i].getSubTotal();
        }
        return total;


    }

    void addItem(Produto prod,int qtde){
        Item item=new Item(prod,qtde);
        //item.setProduto(prod);
        //item.setQuantidade(qtde);
        itens[qntDeItens]=item;
        qntDeItens++;
    }
    void formaDePagamento(float total,float valorPago,String formaDePagamento){
        if(formaDePagamento=="Dinheiro"){
            total-=valorPago;
            System.out.println(valorPago+"Foi pago no"+formaDePagamento);
        }
        if(formaDePagamento=="Cheque"){
            total-=valorPago;
            System.out.println(valorPago+"Foi pago no"+formaDePagamento);
        }
        if(formaDePagamento=="Cartão"){
            total-=valorPago;
            System.out.println(valorPago+"Foi pago no"+formaDePagamento);
        }



    }



}
