public class Retangulo extends FormaGeometrica {
    
    float lado1,lado2;
    
    public void calcularArea(float lado1,float lado2){
        area=lado1*lado2;
        
    }
    
    public void calcularPerimetro(float lado1,float lado2){
        perimetro=lado1+lado2;
        
    }


    public float getArea() {
        return this.area;
    }

    public float getPerimetro() {
        return this.perimetro;
    }
    
}
    
