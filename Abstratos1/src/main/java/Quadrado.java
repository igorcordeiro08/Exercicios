public class Quadrado extends Retangulo {
    float lado;
    
    public void calcularArea(float lado){
        area=lado*lado;
        
    }
    
    public void calcularPerimetro(float lado){
        perimetro=lado*4;
       
    }

    public float getArea() {
        return this.area;
    }

    public float getPerimetro() {
        return this.perimetro;
    }
    
}
    

    

