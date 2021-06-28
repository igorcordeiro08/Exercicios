/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
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
        Item item=new Item();
        item.produto=prod;
        item.quantidade=qtde;
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
