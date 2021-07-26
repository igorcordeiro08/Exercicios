/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class Circulo extends FormaGeometrica {
    float raio;
    public void calcularArea(float raio){
        area=3.14f*(raio*raio);
        
    }
    void calcularPerimetro(float raio){
        perimetro=(2*3.14f)*raio;
        
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
