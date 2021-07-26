/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class Retangulo extends FormaGeometrica {
    
    float lado1,lado2;
    
    public void calcularArea(float lado1,float lado2){
        area=lado1*lado2;
        
    }
    
    public void calcularPerimetro(float lado1,float lado2){
        perimetro=lado1+lado2;
        
    }

    @Override
    public float getArea() {
        return this.area;
    }

    @Override
    public float getPerimetro() {
        return this.perimetro;
    }
    
}
    
