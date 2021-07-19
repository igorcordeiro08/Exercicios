public class Main {
    public static void main(String[]args){
        Quadrado quadrado=new Quadrado(4);
        System.out.println(quadrado.calculaArea(4));
        Retangulo retangulo=new Retangulo();
        System.out.println(retangulo.calculaArea(4,2));
        Triangulo triangulo=new Triangulo();
        System.out.println(triangulo.calculaArea(3,4));
        Circulo circulo=new Circulo();
        System.out.println(circulo.calculaArea(3,3.14));



    }
}


