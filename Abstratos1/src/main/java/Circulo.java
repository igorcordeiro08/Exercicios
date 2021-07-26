public class Circulo extends FormaGeometrica {
    float raio;
    public void calcularArea(float raio){
        area=3.14f*(raio*raio);
        
    }
    void calcularPerimetro(float raio){
        perimetro=(2*3.14f)*raio;
        
    }

    public float getArea() {
        return this.area;
        
    }

    @Override
    public float getPerimetro() {
       return this.perimetro;
    }
    
}
