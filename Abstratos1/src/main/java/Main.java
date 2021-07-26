public class Main {
    public static void main(String[]args){
    Circulo c=new Circulo();
    c.calcularArea(2);
    c.calcularPerimetro(2);
   System.out.println("Area do circulo: "+c.getArea());
   System.out.println("Perimetro do circulo: "+c.getPerimetro());
    
    
    Triangulo t=new Triangulo();
    t.calcularArea(2,3);
    t.calcularPerimetro(3,3,3);
    System.out.println("Area do Triangulo: "+t.getArea());
    System.out.println("Perimetro do Triangulo: "+t.getPerimetro());
    
    Retangulo r=new Retangulo();
    r.calcularArea(2,3);
    r.calcularPerimetro(3,3);
    System.out.println("Area do Retangulo: "+r.getArea());
    System.out.println("Perimetro do Retangulo: "+r.getPerimetro());
    
    Quadrado q=new Quadrado();
    q.calcularArea(2);
    q.calcularPerimetro(3);
    System.out.println("Area do Quadrado: "+q.getArea());
    System.out.println("Perimetro do Quadrado: "+q.getPerimetro());
    
}
}