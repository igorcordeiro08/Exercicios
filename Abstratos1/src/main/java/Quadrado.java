/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class Quadrado extends Retangulo {
    float lado;
    
    public void calcularArea(float lado){
        area=lado*lado;
        
    }
    
    public void calcularPerimetro(float lado){
        perimetro=lado*4;
       
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
    

    

