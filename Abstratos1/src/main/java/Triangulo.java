/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class Triangulo extends FormaGeometrica {
    
    float base;
    float altura; 
    float lado1,lado2,lado3;
    
    public void calcularArea(float base,float altura){
        area=(base*altura)/2;
        
    }
    
    public void calcularPerimetro(float lado1,float lado2,float lado3){
        perimetro=lado1+lado2+lado3;
        
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
