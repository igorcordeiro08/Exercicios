/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class ItemVenda implements Recebivel {
    private String produto;
    private int quantidade;
    private double precoUnitario;
    
    public ItemVenda(String produto,int quantidade,double precoUnitario){
        this.produto=produto;
        this.quantidade=quantidade;
        this.precoUnitario=precoUnitario;
    }

    @Override
    public double TotalizarReceita() {
        return precoUnitario*quantidade;
    }
    }
    

