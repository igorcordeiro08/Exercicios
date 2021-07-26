/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class Servico implements Recebivel {
    private String descricao;
    private int horas;
    private double precoHora;

    public Servico(String descricao,int horas,double precoHora){
        this.descricao=descricao;
        this.horas=horas;
        this.precoHora=precoHora;
        
    }
    
    
    @Override
    public double TotalizarReceita() {
        return horas*precoHora;
    }
    
    
}
